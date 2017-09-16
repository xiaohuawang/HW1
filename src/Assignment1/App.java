package Assignment1;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        // // TODO Auto-generated method stub
        Highway highway = new Highway();
        Vehicle v1 = new Vehicle(10,1);
        Vehicle v2 = new Vehicle(20, 1);
        Vehicle v3 = new Vehicle(30, 1);
        Vehicle v4 = new Vehicle(30, 2);
        Vehicle v5 = new Vehicle(5, 2);
        Vehicle v6 = new Vehicle(11, 2);

        highway.add(v1);
        highway.add(v2);
        highway.add(v3);
        highway.add(v4);
        highway.add(v5);

        Iterator<Vehicle> it=highway.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getVelocity());
        }

        System.out.println();
//        System.out.println(highway.contents.size());
        System.out.println("low east= "+highway.getVelocityEastbound());
        System.out.println("low west= "+highway.getVelocityWestbound());

        System.out.println();
        System.out.println("number east= "+highway.numberVehiclesEastbound());
        System.out.println("number west= "+highway.numberVehiclesWestbound());

    }

}
