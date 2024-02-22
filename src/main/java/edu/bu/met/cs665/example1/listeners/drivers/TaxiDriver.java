/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2024
 * File Name: TaxiDriver.java
 * Description:  Represents a Taxi driver who can handle delivery request updates.
 * Implements the Driver interface to respond to delivery request notifications.
 */
package edu.bu.met.cs665.example1.listeners.drivers;

import edu.bu.met.cs665.example1.listeners.Driver;
import edu.bu.met.cs665.example1.shop.DeliveryRequest;

public class TaxiDriver implements Driver {

    // Attributes

    /**
     * The name of the taxi driver.
     */
    private String name;

    // Constructors

    /**
     * Constructs a new TaxiDriver object with the specified name.
     *
     * @param name The name of the taxi driver.
     */
    public TaxiDriver(String name){
        this.name = name;
    }

    // Methods

    /**
     * Responds to a delivery request update by printing a notification message.
     *
     * @param dr The DeliveryRequest object containing details of the delivery request.
     */
    public void update(DeliveryRequest dr){
        System.out.println(this.name + " taxi driver is notified for the delivery of "
                + dr.getProductName() + " from " + dr.getShopName() + " " + dr.getSource()
                + " to " + dr.getDestination());
    }
}