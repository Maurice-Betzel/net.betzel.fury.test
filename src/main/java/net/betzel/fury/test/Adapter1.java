
package net.betzel.fury.test;

import java.time.OffsetDateTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, OffsetDateTime>
{


    public OffsetDateTime unmarshal(String value) {
        return (net.betzel.fury.test.adapter.OffsetDateTimeXmlAdapter.unmarshal(value));
    }

    public String marshal(OffsetDateTime value) {
        return (net.betzel.fury.test.adapter.OffsetDateTimeXmlAdapter.marshal(value));
    }

}
