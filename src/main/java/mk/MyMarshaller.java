package mk;

import javax.xml.bind.*;
import java.io.File;

public class MyMarshaller {

    public static void marshallToFile(Letter letter, String filename) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Letter.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(letter, new File("C:\\xml\\" + filename + ".xml"));
            marshaller.marshal(letter, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public static Letter unmarshallToFile(String filename) {
        Letter letter = new Letter();

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Letter.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            letter = (Letter) unmarshaller.unmarshal(new File("C:\\xml\\" + filename + ".xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return letter;
    }
}
