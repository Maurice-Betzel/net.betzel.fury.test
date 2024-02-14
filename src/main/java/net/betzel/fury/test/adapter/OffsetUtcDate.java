package net.betzel.fury.test.adapter;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQueries;
import java.util.Objects;

/**
 * A date with an offset from UTC/Greenwich in the ISO-8601 calendar system,
 * such as {@code 2007-12-03+01:00}.
 *
 * <p>
 * The class is merely a thin wrapper around {@link OffsetDateTime} because a
 * date-only class is missing from JDK. The class exist mainly for the purpose
 * of JAXB mapping to/from XML Schema type {@code xs:date}.
 *
 * <p>
 * This is a <a href="{@docRoot}/java/lang/doc-files/ValueBased.html">value-based</a>
 * class; use of identity-sensitive operations (including reference equality
 * ({@code ==}), identity hash code, or synchronization) on instances of
 * {@code OffsetDate} may have unpredictable results and should be avoided.
 * The {@code equals} method should be used for comparisons.
 *
 * <p>
 * This class is immutable and thread-safe.
 */
public final class OffsetUtcDate implements Serializable, Comparable<OffsetUtcDate> {

    private static final long serialVersionUID = -5039366221066381967L;

    private final OffsetDateTime wrappedDateTime;

    private OffsetUtcDate(OffsetDateTime date) {
        this.wrappedDateTime = date;
    }


    /**
     * Obtains an instance of {@code OffsetDate} from a year, month, day,
     * and offset.
     *
     * @param year       the year to represent, for example 2018.
     * @param month      the month-of-year to represent, from 1 (January) to 12 (December)
     * @param dayOfMonth the day-of-month to represent, from 1 to 31
     * @param offset     the zone offset, not null
     * @return a date, not null
     * @see OffsetDateTime#of(int, int, int, int, int, int, int, ZoneOffset)
     */
    public static OffsetUtcDate of(int year, int month, int dayOfMonth, ZoneOffset offset) {
        return new OffsetUtcDate(OffsetDateTime.of(year, month, dayOfMonth, 0, 0, 0, 0, offset));
    }

    /**
     * Obtains an instance of {@code OffsetDate} from a {@code LocalDate}
     * and an offset.
     *
     * @param date   local date, not null
     * @param offset the zone offset, not null
     * @return a date, not null
     * @see OffsetDateTime#of(LocalDate, LocalTime, ZoneOffset)
     */
    public static OffsetUtcDate of(LocalDate date, ZoneOffset offset) {
        Objects.requireNonNull(date, "date argument must not be null");
        Objects.requireNonNull(date, "offset argument must not be null");
        return new OffsetUtcDate(OffsetDateTime.of(date, LocalTime.MIDNIGHT, offset));
    }

    /**
     * Obtains an instance of {@code OffsetDate} from an {@code OffsetDateTime}
     * The time part of the input value will be
     * {@link OffsetDateTime#truncatedTo(java.time.temporal.TemporalUnit)  removed}.
     *
     * @param datetime datetime value, not null
     * @return a date, not null
     */
    public static OffsetUtcDate of(OffsetDateTime datetime) {
        Objects.requireNonNull(datetime, "datetime argument must not be null");
        return new OffsetUtcDate(datetime.truncatedTo(ChronoUnit.DAYS));
    }

    /**
     * Gets the date value.
     *
     * @return datetime value with time part set to midnight, never null
     */
    public OffsetDateTime getDate() {
        return wrappedDateTime;
    }

    /**
     * A hash code for this date.
     *
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {
        return wrappedDateTime.hashCode();
    }

    /**
     * Checks if this date is equal to another date.
     * <p>
     * The comparison is delegated to the wrapped {@code OffsetDateTime}.
     * To compare for the same instant on the time-line, use {@link OffsetDateTime#isEqual(OffsetDateTime) getDate().isEqual()}.
     * Only objects of type {@code OffsetDate} are compared, other types return false.
     *
     * @param obj the object to check, null returns false
     * @return true if this is equal to the other date
     * @see OffsetDateTime#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetUtcDate) {
            OffsetUtcDate other = (OffsetUtcDate) obj;
            return wrappedDateTime.equals(other.getDate());
        }
        return false;
    }

    /**
     * Compares this date to another date.
     * <p>
     * The comparison is delegated to the wrapped {@code OffsetDateTime}.
     *
     * @param other the other date to compare to, not null
     * @return the comparator value, negative if less, positive if greater
     * @see OffsetDateTime#compareTo(OffsetDateTime)
     */
    @Override
    public int compareTo(OffsetUtcDate other) {
        return wrappedDateTime.compareTo(other.getDate());
    }

    /**
     * Obtains an instance of {@code OffsetDate} from a temporal object.
     * <p>
     * This obtains an offset date based on the specified temporal.
     * A {@code TemporalAccessor} represents an arbitrary set of date and time information,
     * which this factory converts to an instance of {@code OffsetDate}. Any
     * time information in the {@code temporal} will be ignored.
     *
     * <p>
     * The conversion will first obtain a {@code ZoneOffset} from the temporal object.
     * It will then try to obtain a {@code LocalDate}, falling back to an {@code Instant} if necessary.
     * The result will be the combination of {@code ZoneOffset} with either
     * with {@code LocalDate} or {@code Instant}.
     *
     * <p>
     * This method matches the signature of the functional interface {@link java.time.temporal.TemporalQuery}
     * allowing it to be used as a query via method reference, {@code OffsetDate::from}.
     *
     * @param temporal the temporal object to convert, not null
     * @return the offset date, not null
     * @throws DateTimeException if unable to convert to an {@code OffsetDate}
     */
    public static OffsetUtcDate from(TemporalAccessor temporal) {
        Objects.requireNonNull(temporal, "temporal argument must not be null");
        if (temporal instanceof OffsetDateTime) {
            OffsetDateTime dt = (OffsetDateTime) temporal;
            return OffsetUtcDate.of(dt);
        }
        try {
            ZoneOffset offset = temporal.query(TemporalQueries.offset());
            if (offset == null) {
                throw new DateTimeException("There is no timezone offset in the input and no default has been provided by the DateTimeFormatter in use.");
            }
            LocalDate date = temporal.query(TemporalQueries.localDate());
            if (date != null) {
                return OffsetUtcDate.of(date, offset);
            } else {
                Instant instant = Instant.from(temporal);
                OffsetDateTime dt = OffsetDateTime.ofInstant(instant, offset);
                return OffsetUtcDate.of(dt);
            }
        } catch (DateTimeException ex) {
            throw new DateTimeException("Unable to obtain OffsetDate from TemporalAccessor: "
                    + temporal + " of type " + temporal.getClass().getName(), ex);
        }
    }

}
