package Assignment1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ReverseNumberTest {

    private static ReverseNumber reverseNumber = null;

    @Before
    public void setUp() throws Exception {
        reverseNumber = new ReverseNumber();
    }

    @Test(expected = InputMismatchException.class)
    public void expectedInputMismatchException1() {
        String input = "22.33";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        reverseNumber.reverseNumber();
    }

    @Test(expected = InputMismatchException.class)
    public void expectedInputMismatchException2() {
        String input = "aaa";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        reverseNumber.reverseNumber();
    }

    @Test(expected = InputMismatchException.class)
    public void expectedIllegalArgumentException() {
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        reverseNumber.reverseNumber();
    }

    @Test
    public void reverseNumberTest1() {
        String input = "123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int res = reverseNumber.reverseNumber();
        assertEquals(321, res);
    }

}