package Assignment1;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;

public class ReverseNumberTest {

    //    public void MyTest() {
//
//    }
    private static ReverseNumber rsNum = null;

    @Test
    public void shouldTakeUserInput() {

        String input = "add 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("add 5", rsNum.inputNum());
    }

}