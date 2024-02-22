/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2024
 * File Name: RequestManager.java
 * Description: Manages subscriptions and notifications for delivery requests. This class allows objects to subscribe, unsubscribe, and be notified of delivery requests.
 */
package edu.bu.met.cs665.example1.publisher;

import java.util.ArrayList;

import edu.bu.met.cs665.example1.listeners.RequestListener;
import edu.bu.met.cs665.example1.shop.DeliveryRequest;

public class RequestManager {

    // Attributes

    /**
     * List of listeners subscribed to receive delivery requests.
     */
    private ArrayList<RequestListener> listeners;

    // Constructors

    /**
     * Constructs a new RequestManager with an empty list of listeners.
     */
    public RequestManager(){
        this.listeners = new ArrayList<>();
    }

    // Methods

    /**
     * Subscribes a listener to receive delivery requests.
     *
     * @param driver The RequestListener object to subscribe.
     */
    public void subscribe(RequestListener driver){
        this.listeners.add(driver);
    }

    /**
     * Unsubscribes a listener from receiving delivery requests.
     *
     * @param driver The RequestListener object to unsubscribe.
     */
    public void unsubscribe(RequestListener driver){
        this.listeners.remove(driver);
    }

    /**
     * Notifies all subscribed listeners about a new delivery request.
     *
     * @param dr The DeliveryRequest to be notified to all listeners.
     */
    public void notify(DeliveryRequest dr){
        for (RequestListener driver : this.listeners) {
            driver.update(dr);
        }
    }
}