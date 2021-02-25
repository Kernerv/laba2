import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringProcessorTest {

    @Test
    public void testRepeatNTimesWithValidData(){
        String str = "123";
        String str1 = "123123123";
        assertEquals(str1, StringProcessor.repeatNTimes(str, 3));
        assertEquals("", StringProcessor.repeatNTimes(str, 0));
    }

    @Test
    public void testRepeatNTimesException(){
        String str1 = "123";
        assertThrows(IllegalArgumentException.class, ()->StringProcessor.repeatNTimes(str1, -1));
    }

    @Test
    public void testCountOfOccurrencesWithValidData(){
        String str = "123 123 123";
        String str1 = "123";
        String str2 = "1234";
        String str3 = "wdza wazssx ujkkdzvc";
        String str4 = "dz";
        assertEquals(3, StringProcessor.countOfOccurrences(str, str1));
        assertEquals(2, StringProcessor.countOfOccurrences(str3, str4));
        assertEquals(0, StringProcessor.countOfOccurrences(str, str2));

    }

    @Test
    public void testCountOfOccurrencesException(){
        String str = "123 123 123";
        String str2 = null;
        assertThrows(IllegalArgumentException.class, ()->StringProcessor.countOfOccurrences(str, str2));
    }

    @Test
    public void testReplace123(){
        assertEquals("один ячячя чя два ячя ячя три счясч", StringProcessor.replace123("1 ячячя чя 2 ячя ячя 3 счясч"));
        assertEquals("dsad asd asdas asdas", StringProcessor.replace123("dsad asd asdas asdas"));
        assertEquals("czxcddcds один sfdada", StringProcessor.replace123("czxcddcds 1 sfdada"));
    }

    @Test
    public void testDeleteEvenChars(){
        assertEquals("azc", StringProcessor.deleteEvenChars(new StringBuilder("dadzxcx")).toString());
        assertEquals("vvww", StringProcessor.deleteEvenChars(new StringBuilder("dvqvzwxw")).toString());
    }
}
