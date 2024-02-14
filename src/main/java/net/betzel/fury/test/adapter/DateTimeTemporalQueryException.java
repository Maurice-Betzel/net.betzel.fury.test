package net.betzel.fury.test.adapter;

import java.time.DateTimeException;

/**
 * An exception thrown when an error occurs during a temporal query during a
 * parse operation from classes in this package. The exception is used when the
 * expected elements are not found in the temporal. Typically, the exception gets
 * wrapped in a
 * {@link java.time.format.DateTimeParseException DateTimeParseException} so
 * that this exception is mainly used as a linked exception, not the primary
 * (top-level) exception.
 *
 * @see java.time.temporal.TemporalQuery
 */
public class DateTimeTemporalQueryException extends DateTimeException {

    public DateTimeTemporalQueryException(String message, Throwable cause) {
        super(message, cause);
    }

    public DateTimeTemporalQueryException(String message) {
        super(message);
    }

}
