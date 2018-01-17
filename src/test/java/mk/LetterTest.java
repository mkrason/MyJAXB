package mk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LetterTest {

    @Test
    void testMyMarshaller() {

        Letter letter1 = new Letter("11-221", "Lodz1", "Limano1");
        Letter letter2 = new Letter("22-221", "Lodz2", "Limano2");
        Letter letter3 = new Letter("33-221", "Lodz3", "Limano3");

        MyMarshaller.marshallToFile(letter1, "letter1");
        MyMarshaller.marshallToFile(letter2, "letter2");
        MyMarshaller.marshallToFile(letter3, "letter3");

        Letter letter11 = MyMarshaller.unmarshallToFile("letter1");
        Letter letter22 = MyMarshaller.unmarshallToFile("letter2");
        Letter letter33 = MyMarshaller.unmarshallToFile("letter3");

        assertTrue(letter1.equals(letter11) && letter2.equals(letter22) && letter3.equals(letter33));
    }
}