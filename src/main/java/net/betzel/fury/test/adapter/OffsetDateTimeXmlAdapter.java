package net.betzel.fury.test.adapter;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * JAXB adapter to convert between {@code xs:dateTime} and {@code OffsetDateTime}.
 *
 * <p>
 * If the adapter is used for unmarshalling (parsing XML to object) and
 * there is no zone offset in the input data then it may be needed to
 * extend this class and customize the
 * {@link #getZoneOffsetForDateTime(LocalDateTime) } method.
 */
public class OffsetDateTimeXmlAdapter {

    /**
     * Converts from {@code xs:dateTime} format.
     *
     * <p>
     * A number of minor deviations from the standard are accepted while parsing.
     * See {@link DateTimeFormatter#XSD_DATETIME_PARSER} for more information.
     *
     * <p>
     * If there are more than 9 fractional digits on the second value then
     * digits after the 9th digit will be ignored.
     */
    public static final OffsetDateTime unmarshal(String v) {
        return DateTimeFormatter.parseIntoOffsetDateTime(v, OffsetDateTimeXmlAdapter::getZoneOffsetForDateTime);
    }

    /**
     * Converts to {@code xs:dateTime} format.
     */
    public static final String marshal(OffsetDateTime v) {
        if (v == null) return null;
        return DateTimeFormatter.XSD_DATETIME.format(v);
    }

    /**
     * Gets ZoneOffset for a given {@code LocalDateTime} value.
     * Sub-classes may override this.
     *
     * <p>
     * This method is needed because the XML Schema
     * {@code dateTime} data type allows to leave out the offset. Therefore,
     * when unmarshalling there may be no offset in the input data. If this is
     * the case then this method will be called. In summary, the method
     * is only called when unmarshalling and only when input data has no offset.
     *
     * <p>
     * The default implementation uses the the system's default zone id
     * (from {@link ZoneOffset#systemDefault()}) and then finds
     * the appropriate offset for that zone given a point in time of {@code localDateTime}.
     *
     * @param localDateTime
     * @return offset to use when none is present in XML input data, never null
     */
    public static ZoneOffset getZoneOffsetForDateTime(LocalDateTime localDateTime) {
        ZoneId systemDefaultZoneId = ZoneOffset.systemDefault();
        return systemDefaultZoneId.getRules().getOffset(localDateTime);
    }

}
