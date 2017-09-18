package Assignment1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScenicRoadTest {

    private static ScenicRoad sRoad = null;
    private static Highway highway=null;

    @BeforeClass
    public static void setupBeforeTests() throws Exception {
        highway=new Highway();
    }

    @Test(expected=IllegalArgumentException.class)
    public void expectedIllegalArgumentException(){
        ScenicRoad scenicRoad = new ScenicRoad(-1,highway);
    }


    @Test
    public void testEastCase() {

        ScenicRoad scenicRoad = new ScenicRoad(1,highway);
        Vehicle v1 = new Vehicle(30, 1);
        assertEquals(30.0, v1.getVelocity(),0);
        Vehicle v2 = new Vehicle(50, 1);
        Vehicle v3 = new Vehicle(60, 1);
        Vehicle v4 = new Vehicle(60, 2);
        scenicRoad.add(v1);
        assertEquals(30, v1.getVelocity(),0);
        scenicRoad.add(v2);
        scenicRoad.add(v3);
        assertEquals(5.0, v1.getVelocity(),0);
        assertEquals(5.0, v2.getVelocity(),0);
        assertEquals(5.0, v3.getVelocity(),0);
        assertEquals(60.0, v4.getVelocity(),0);
    }

    @Test
    public void testWestCase() {
        ScenicRoad scenicRoad = new ScenicRoad(2,highway);
        Vehicle v1 = new Vehicle(30, 2);
        assertEquals(true, highway.add(v1));
        assertEquals(false, highway.add(v1));
        assertEquals(30, v1.getVelocity(),0.01);
    }

}