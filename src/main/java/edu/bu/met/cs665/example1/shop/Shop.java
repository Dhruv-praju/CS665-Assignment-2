/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2024
 * File Name: Shop.java
 * Description: Represents a shop with attributes and methods for managing products and handling delivery requests.This class encapsulates the essential features of a shop.
 */
package edu.bu.met.cs665.example1.shop;

import java.util.ArrayList;
import java.util.Arrays;

import edu.bu.met.cs665.example1.publisher.RequestManager;

/**
 * 
 */
public class Shop {

    // Attributes

    /**
     * The name of the shop.
     */
    private String name;

    /**
     * The location of the shop.
     */
    private String location;

    /**
     * List of items available in the shop.
     */
    private ArrayList<String> items;

    /**
     * The RequestManager responsible for handling delivery requests for the shop.
     */
    public RequestManager deliveryManager;

    // Constructors

    /**
     * Constructs a new Shop object with the given name and location.
     * Initializes the items list and sets up the delivery manager.
     *
     * @param name     The name of the shop.
     * @param location The location of the shop.
     */
    public Shop(String name, String location){
        this.name = name;
        this.location = location;
        this.items = new ArrayList<>(Arrays.asList("Milk", "Eggs", "Bread", "Vegetables"));
        this.deliveryManager = new RequestManager();
    }

    // Methods

    /**
     * Adds new products to the shop's inventory.
     *
     * @param products The names of the products to be added.
     */
    public void addProducts(String... products){
        items.addAll(Arrays.asList(products));
    }

    /**
     * Removes a product from the shop's inventory.
     *
     * @param name The name of the product to be removed.
     */
    public void removeProduct(String name){
        items.remove(name);
    }

    /**
     * Retrieves a list of all products available in the shop.
     *
     * @return ArrayList of product names.
     */
    public ArrayList<String> getAllProducts(){
        return new ArrayList<>(items);
    }

    /**
     * Places an order for a specific product to be delivered to a destination.
     * Notifies the delivery manager about the new delivery request.
     *
     * @param productName The name of the product to be ordered.
     * @param destination The destination for the delivery.
     */
    public void orderProduct(String productName, String destination){
        DeliveryRequest dr = new DeliveryRequest(this.name, productName, this.location, destination);
        this.deliveryManager.notify(dr);
    }
}
