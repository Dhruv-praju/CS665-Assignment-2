/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2024
 * File Name: TruckDriver.java
 * Description:  Represents a truck driver who can handle delivery request updates.
 * Implements the Driver interface to respond to delivery request notifications.
 */
package edu.bu.met.cs665.example1.listeners.drivers;

import edu.bu.met.cs665.example1.listeners.Driver;
import edu.bu.met.cs665.example1.shop.DeliveryRequest;

public class TruckDriver implements Driver {

    // Attributes

    /**
     * The name of the truck driver.
     */
    private String name;

    // Constructors

    /**
     * Constructs a new TruckDriver object with the specified name.
     *
     * @param name The name of the truck driver.
     */
    public TruckDriver(String name){
        this.name = name;
    }

    // Methods

    /**
     * Responds to a delivery request update by printing a notification message.
     *
     * @param dr The DeliveryRequest object containing details of the delivery request.
     */
    public void update(DeliveryRequest dr){
        System.out.println(this.name + " truck driver is notified for the delivery of "
                + dr.getProductName() + " from " + dr.getShopName() + " " + dr.getSource()
                + " to " + dr.getDestination());
    }
}

