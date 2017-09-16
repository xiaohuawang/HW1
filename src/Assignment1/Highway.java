/**
 * This is part of Assignment 1: Environment Setup and Review of Java for PDP, Fall 2017
 */
package Assignment1;

import java.lang.Iterable;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Collections;

/**
 * This is a container that can be used to contain Vehicles.
 * A given Vehicle may only appear on a Highway once.
 */
public class Highway implements Iterable<Vehicle> {

    // Contents of the Highway.
    private Set<Vehicle> contents;

    /**
     * Constructor that creates a new Highway.
     */
    public Highway() {
        contents = new LinkedHashSet<Vehicle>();
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
        return Collections.unmodifiableSet(contents).iterator();
    }

    /**
     * Adds a vehicle on the Highway. This method returns <tt>true</tt>
     * if a Vehicle was successfully added on the Highway, i.e. vehicle is
     * not already on the Highway. (You are allowed to put
     * a Vehicle on a Highway only once. Hence, this method returns
     * <tt>false</tt>, if a Vehicle is already on the Highway).
     *
     * @param v Vehicle to be added.
     * @return true if vehicle was successfully added on the highway,
     * i.e. vehicle is not already on the highway. Returns false, if vehicle is
     * already on the highway.
     * @requires v != null.
     */
    public boolean add(Vehicle v) {
        // Your code goes here.  Remove the exception after you're done.
        if (!contents.contains(v)) {
//            System.out.println("come add");
            contents.add(v);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes a vehicle from the highway. This method returns
     * <tt>true</tt> if vehicle was successfully removed from the
     * highway, i.e. vehicle is actually on the highway. You cannot
     * remove a Vehicle if it is not already on the Highway, and so ths
     * method will return <tt>false</tt>, otherwise.
     *
     * @param v Vehicle to be removed.
     * @return true if vehicle was successfully removed from the Highway,
     * i.e. vehicle is actually on the highway. Returns false, if vehicle is not
     * on the highway.
     * @requires v != null.
     */
    public boolean remove(Vehicle v) {
        // Your code goes here.  Remove the exception after you're done.
        if (contents.contains(v)) {
            contents.remove(v);
            return true;
        } else {
            return false;
            // throw new RuntimeException("Method not implemented");
        }
    }

    /**
     * Each Vehicle has a velocity. This method returns the velocity of the slowest vehicle in the Eastbound direction of the highway.
     *
     * @return the velocity of the slowest eastbound vehicle
     */
    public double getVelocityEastbound() {
        // Your code goes here.  Remove the exception after you're done.
        double LowestEastSpeed= Double.MAX_VALUE;

        for(Vehicle v:contents){
            if(v.getDirection()==1&&v.getVelocity()<LowestEastSpeed){
//                System.out.println("east come");
                LowestEastSpeed=v.getVelocity();
            }
        }
        return LowestEastSpeed;
    }

    /**
     * Each Vehicle has a velocity. This method returns the velocity of the slowest vehicle in the Westbound direction of the highway.
     *
     * @return the velocity of the slowest westbound vehicle
     */
    public double getVelocityWestbound() {
        // Your code goes here.  Remove the exception after you're done.
        double LowestWestSpeed= Double.MAX_VALUE;

        for(Vehicle v:contents){
            if(v.getDirection()==2&&v.getVelocity()<LowestWestSpeed){
//                System.out.println("west come");
                LowestWestSpeed=v.getVelocity();
            }
        }
        return LowestWestSpeed;
    }

    /**
     * Returns the number of Vehicles headed Eastbound.
     *
     * @return the number of Vehicles headed Eastbound on the highway
     */
    public int numberVehiclesEastbound() {
        // Your code goes here.  Remove the exception after you're done.
        int countEast=0;

        for(Vehicle v:contents){
            if(v.getDirection()==1){
                countEast++;
            }
        }
        return countEast;
    }

    /**
     * Returns the number of Vehicles headed Westbound.
     *
     * @return the number of Vehicles headed Westbound on the highway
     */
    public int numberVehiclesWestbound() {
        // Your code goes here.  Remove the exception after you're done.
        int countWest=0;

        for(Vehicle v:contents){
            if(v.getDirection()==2){
                countWest++;
            }
        }
        return countWest;
    }

    /**
     * This method returns <tt>true</tt> if a specific Vehicle is on the Highway.
     * It will return <tt>false</tt> otherwise.
     *
     * @param v Vehicle to be checked if its on the Highway
     * @return true if this vehicle is on the Highway. Returns
     * false, otherwise.
     * @requires v != null.
     */
    public boolean contains(Vehicle v) {
        // Your code goes here.  Remove the exception after you're done.
        if(contents.contains(v)){
            return true;
        }else{
            return false;
        }
    }

}