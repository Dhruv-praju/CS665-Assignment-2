/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2024
 * File Name: DeliveryRequest.java
 * Description: Represents a delivery request with information about the product, shop, source, and destination.
 * This class encapsulates the details of a delivery request
 */
package edu.bu.met.cs665.example1.shop;
public class DeliveryRequest {

    // Attributes

    /**
     * The name of the shop making the delivery request.
     */
    private String shopName;

    /**
     * The name of the product for the delivery request.
     */
    private String productName;

    /**
     * The source location of the delivery.
     */
    private String source;

    /**
     * The destination location for the delivery.
     */
    private String destination;

    // Constructors

    /**
     * Constructs a new DeliveryRequest object with the specified details.
     *
     * @param shopName    The name of the shop making the delivery request.
     * @param productName The name of the product for the delivery request.
     * @param source      The source location of the delivery.
     * @param destination The destination location for the delivery.
     */
    public DeliveryRequest(String shopName, String productName, String source, String destination){
        this.shopName = shopName;
        this.productName = productName;
        this.source = source;
        this.destination = destination;
    }

    // Getter Methods

    /**
     * Retrieves the name of the shop making the delivery request.
     *
     * @return The name of the shop.
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * Retrieves the name of the product for the delivery request.
     *
     * @return The name of the product.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Retrieves the source location of the delivery.
     *
     * @return The source location.
     */
    public String getSource() {
        return source;
    }

    /**
     * Retrieves the destination location for the delivery.
     *
     * @return The destination location.
     */
    public String getDestination() {
        return destination;
    }
}
