package Assignment1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class VehicleTest {

    private static Vehicle vehicle = null;

    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle(10, 1);
    }

//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void getVelocity() throws Exception{
        assertEquals(10, vehicle.getVelocity(),0);
    }

    @Test
    public void getDirection() throws Exception{
        assertEquals(1, vehicle.getDirection(),0);
    }

}