package net.betzel.fury.test;

import net.betzel.fury.test.model.Order;
import org.apache.fury.Fury;
import org.apache.fury.config.CompatibleMode;
import org.apache.fury.config.FuryBuilder;
import org.apache.fury.config.Language;
import org.apache.fury.config.LongEncoding;
import org.instancio.Instancio;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;

public class Main {


    public static void main(String[] args) {

        Javers javers = JaversBuilder.javers().build();

        Order order = Instancio.create(Order.class);

//        JAXBContext jaxbContext = JAXBContext.newInstance(net.betzel.fury.test.ObjectFactory.class);
//        Marshaller marshaller = jaxbContext.createMarshaller();
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        marshaller.setProperty(Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8.name());

        Fury fury = createFury();

        byte[] bytes = fury.serialize(order);

        Order orderResult = (Order) fury.deserialize(bytes);

        Diff diff = javers.compare(order, orderResult);

        System.out.println(diff.toString());

    }

    private static Fury createFury() {
        FuryBuilder furyBuilder = Fury.builder()
                .withLanguage(Language.JAVA)
                .withMetaContextShare(false)
                .withRefTracking(true)
                .withIntCompressed(true)
                .withStringCompressed(true)
                .withLongCompressed(LongEncoding.PVL)
                .withCompatibleMode(CompatibleMode.COMPATIBLE)
                .withClassVersionCheck(false)
                .withJdkClassSerializableCheck(true)
                .withDeserializeUnexistedClass(false)
                .withAsyncCompilation(false)
                .withCodegen(true)
                .ignoreTimeRef(true)
                .ignoreStringRef(true)
                .ignoreBasicTypesRef(true)
                .registerGuavaTypes(false)
                .requireClassRegistration(false)
                .suppressClassRegistrationWarnings(true);
        return furyBuilder.build();
    }

}
