
package net.betzel.fury.test.model;

import java.time.OffsetTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, OffsetTime>
{


    public OffsetTime unmarshal(String value) {
        return (net.betzel.fury.test.adapter.OffsetTimeXmlAdapter.unmarshal(value));
    }

    public String marshal(OffsetTime value) {
        return (net.betzel.fury.test.adapter.OffsetTimeXmlAdapter.marshal(value));
    }

}
