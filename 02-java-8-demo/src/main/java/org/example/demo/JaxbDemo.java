package org.example.demo;

import javax.xml.bind.JAXBContext;
import org.omg.CORBA.Any;

public class JaxbDemo {

    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance(Dummy.class);
        System.out.println("[JAXB] Context created: " + context);
    }

}