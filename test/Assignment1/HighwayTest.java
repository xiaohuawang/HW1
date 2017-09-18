package Assignment1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighwayTest {

    private static Highway highway = null;

    @BeforeClass
    public static void setupBeforeTests() throws Exception {
        highway = new Highway();
    }

    @Test
    public void testInductiveCase() {
        Vehicle v1 = new Vehicle(10, 1);
        Vehicle v2 = new Vehicle(20, 2);
        Vehicle v3 = new Vehicle(30, 1);
        Vehicle v4 = new Vehicle(5, 1);
        assertEquals(true, highway.add(v1));
        assertEquals(false, highway.add(v1));
        assertEquals(true, highway.add(v2));
        assertEquals(true, highway.remove(v1));
        assertEquals(false, highway.remove(v1));
        assertEquals(true, highway.add(v3));
        assertEquals(true, highway.add(v4));
        assertEquals(5, highway.getVelocityEastbound(),0);
        assertEquals(20, highway.getVelocityWestbound(),0);
        assertEquals(2, highway.numberVehiclesEastbound());
        assertEquals(1, highway.numberVehiclesWestbound());
    }

}