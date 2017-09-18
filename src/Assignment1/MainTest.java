package Assignment1;

import java.util.Iterator;

public class MainTest {
    public static void main(String[] args) {
        // // TODO Auto-generated method stub
        Highway highway = new Highway();
        Vehicle v1 = new Vehicle(10, 1);
        Vehicle v2 = new Vehicle(20, 1);
        Vehicle v3 = new Vehicle(30, 1);
        Vehicle v4 = new Vehicle(30, 2);
        Vehicle v5 = new Vehicle(20, 2);
        Vehicle v6 = new Vehicle(11, 2);

//        System.out.println(highway.getVelocityEastbound());

//        highway.add(v1);
//        highway.add(v2);
//        highway.add(v3);
//        highway.add(v4);
//        highway.add(v5);
//        highway.add(v6);

//        Iterator<Vehicle> it=highway.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next().getVelocity());
//        }
//
//        System.out.println("start");
//        System.out.println();
//
//        System.out.println("low east= "+highway.getVelocityEastbound());
//        System.out.println("low west= "+highway.getVelocityWestbound());
//
//        System.out.println();
//        System.out.println("number east= "+highway.numberVehiclesEastbound());
//        System.out.println("number west= "+highway.numberVehiclesWestbound());

        highway.remove(v1);

        System.out.println();
        System.out.println("number east= "+highway.numberVehiclesEastbound());
        System.out.println("number west= "+highway.numberVehiclesWestbound());

        ScenicRoad sRode = new ScenicRoad(1, highway);
        sRode.add(v1);
        sRode.add(v2);
        sRode.add(v3);
        sRode.add(v4);
        sRode.add(v5);
        sRode.add(v6);

        System.out.println(v1.getVelocity());
//        ScenicRoad sRode = new ScenicRoad(1, highway);
//        sRode.add(v1);
//        sRode.add(v5);
//
//        System.out.println("v1 speed=" + v1.getVelocity());
//        System.out.println("v5 speed=" + v5.getVelocity());
//
//        sRode.add(v2);
//        sRode.add(v6);
//
//        System.out.println();
//        System.out.println("v1 speed=" + v1.getVelocity());
//        System.out.println("v2 speed=" + v2.getVelocity());
//        System.out.println("v5 speed=" + v5.getVelocity());

    }

}
