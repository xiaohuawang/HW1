package Assignment1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ScenicRoad implements Iterable<Vehicle> {

    private Highway highway;
    private int bandwidth;
    private LinkedHashSet<Vehicle> contents = new LinkedHashSet<Vehicle>();

    /**
     * Constructor that creates a new ScenicRoad.
     */
    public ScenicRoad(int bandwidth, Highway highway) {
        if (bandwidth <= 0) {
            throw new IllegalArgumentException("bandwidth should be positive number");
        }
        this.bandwidth = bandwidth;
        this.highway = highway;
//        contents = new LinkedHashSet<Vehicle>();
    }

    /**
     * Implements the Iterable interface for this container.
     *
     * @return an Iterator over the Vehicle objects contained
     * in this container.
     */
    public Iterator<Vehicle> iterator() {
        // If we just returned the iterator of "contents", a client
        // could call the remove() method on the iterator and modify
        // it behind our backs.  Instead, we wrap contents in an
        // "unmodifiable set"; calling remove() on this iterator
        // throws an exception.  This is an example of avoiding
        // "representation exposure."
        return highway.iterator();
    }

    /**
     * Adds a vehicle on the ScenicRoad. This method returns <tt>true</tt>
     * if a Vehicle was successfully added on the ScenicRoad, i.e. vehicle is
     * not already on the Highway.
     *
     * @param v Vehicle to be added.
     * @return true if vehicle was successfully added on the highway,
     * i.e. vehicle is not already on the highway. Returns false, if vehicle is
     * already on the highway.
     * @requires v != null.
     */
    public boolean add(Vehicle v) {

        if (this.highway.contains(v)) {
            return false;
        } else {
            this.highway.add(v);

            System.out.println("s road east = " + this.highway.numberVehiclesEastbound());
            System.out.println("s road west = " + this.highway.numberVehiclesWestbound());
            System.out.println();

            if (highway.numberVehiclesEastbound() > bandwidth) {
                Iterator<Vehicle> it = highway.iterator();
                while (it.hasNext()) {
                    Vehicle vehicle = it.next();
                    if (vehicle.getDirection() == 1) {
                        vehicle.setVelocity(5.0);
                    }
                }
            }
            if (highway.numberVehiclesWestbound() > bandwidth) {
                Iterator<Vehicle> it = highway.iterator();
                while (it.hasNext()) {
                    Vehicle vehicle = it.next();
                    if (vehicle.getDirection() == 2) {
                        vehicle.setVelocity(5.0);
                    }
                }
            }
        }
        return true;
    }


}
