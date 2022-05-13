package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class xml {
    public static void XmlWrite(String filename)
    {
        try {
            File file = new File(filename);
            JAXBContext context = JAXBContext.newInstance(My.class);
            Marshaller marshaller = context.createMarshaller();
            My My2 = new My(20, "Sveta");
            marshaller.marshal(My2, file);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
    public static void XmlRead(String filename)
    {   System.out.println("Информация из XML-файла:");
        try {
            File file = new File(filename);
            JAXBContext context = JAXBContext.newInstance(My.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            My My3 = (My) unmarshaller.unmarshal(file);
            System.out.println(My3);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }}
}
