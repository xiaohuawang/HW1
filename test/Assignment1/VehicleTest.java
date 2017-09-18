package Assignment1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class VehicleTest {

    private static Vehicle vehicle = null;

    @Test(expected=IllegalArgumentException.class)
    public void expectedVelocityIllegalArgumentException() {
        vehicle = new Vehicle(-10, 1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void expectedDirectionIllegalArgumentException() {
        vehicle = new Vehicle(10, 3);
    }

    @Test
    public void getVelocity() throws Exception {
        vehicle = new Vehicle(10, 1);
        assertEquals(10, vehicle.getVelocity(), 0);
    }

    @Test
    public void getDirection() throws Exception {
        vehicle = new Vehicle(10, 1);
        assertEquals(1, vehicle.getDirection(), 0);
    }

}