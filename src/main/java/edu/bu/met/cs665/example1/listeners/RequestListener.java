/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2024
 * File Name: RequestListener.java
 * Description: An interface for objects that listen for and handle delivery request updates.Classes implementing this interface can subscribe to delivery requests and respond to updates.
 */

package edu.bu.met.cs665.example1.listeners;

import edu.bu.met.cs665.example1.shop.DeliveryRequest;

/**
 * 
 */
public interface RequestListener {

    /**
     * Updates the listener with information about a new delivery request.
     *
     * @param dr The DeliveryRequest object containing details of the new delivery request.
     */
    void update(DeliveryRequest dr);
}
