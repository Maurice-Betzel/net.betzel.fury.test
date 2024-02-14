
package net.betzel.fury.test.model;

import java.time.OffsetDateTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, OffsetDateTime>
{


    public OffsetDateTime unmarshal(String value) {
        return (net.betzel.fury.test.adapter.OffsetDateXmlAdapter.unmarshal(value));
    }

    public String marshal(OffsetDateTime value) {
        return (net.betzel.fury.test.adapter.OffsetDateXmlAdapter.marshal(value));
    }

}
