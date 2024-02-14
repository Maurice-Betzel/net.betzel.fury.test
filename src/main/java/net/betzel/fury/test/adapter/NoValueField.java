package net.betzel.fury.test.adapter;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;
import java.util.Locale;

/**
 * Temporal Fields with no value.
 *
 * <p>
 * Strictly speaking these are anomalies. This class exists for the sole purpose
 * of being able to express different allowed values for literals in a
 * {@code DateTimeFormatter}.
 */
enum NoValueField implements TemporalField {

    DATE_TIME_DELIMITER {
        @Override
        public String toString() {
            return "Date Time delimiter";
        }

    };

    @Override
    public String getDisplayName(Locale locale) {
        return toString();
    }

    @Override
    public TemporalUnit getBaseUnit() {
        return ChronoUnit.FOREVER; // Irrelevant, but we must return something.
    }

    @Override
    public TemporalUnit getRangeUnit() {
        return ChronoUnit.FOREVER; // Irrelevant, but we must return something.
    }

    @Override
    public ValueRange range() {
        return ValueRange.of(1, 99);
    }

    @Override
    public boolean isDateBased() {
        return false;
    }

    @Override
    public boolean isTimeBased() {
        return false;
    }

    @Override
    public boolean isSupportedBy(TemporalAccessor temporal) {
        return false;
    }

    @Override
    public ValueRange rangeRefinedBy(TemporalAccessor temporal) {
        return range();
    }

    @Override
    public long getFrom(TemporalAccessor temporal) {
        return 1;   // Field has no value so we always return 1
    }

    @Override
    public <R extends Temporal> R adjustInto(R temporal, long newValue) {
        return temporal;
    }

}
