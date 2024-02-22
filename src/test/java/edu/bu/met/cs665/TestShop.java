
package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.example1.listeners.drivers.ScooterDriver;
import edu.bu.met.cs665.example1.listeners.drivers.TaxiDriver;
import edu.bu.met.cs665.example1.listeners.drivers.TruckDriver;
import edu.bu.met.cs665.example1.listeners.drivers.VanDriver;
import edu.bu.met.cs665.example1.shop.Shop;

/**
 * Test class for Shop functionality and delivery notification system.
 */
public class TestShop {

    // Constructors

    /**
     * Constructs a new TestShop object.
     */
    public TestShop(){

    }

    // Test Methods

    /**
     * Test case to verify the addition of items to the shop's inventory.
     */
    @Test
    public void testAddItemsToShopTest(){
        Shop myFoodMart = new Shop("7-Eleven", "Boston 02215");

        myFoodMart.addProducts("Oil", "Fruits");
    }

    /**
     * Test case to verify the retrieval of all products from the shop's inventory.
     */
    @Test
    public void testGetAllProducts(){
        Shop myShop = new Shop("star market", "Boston 02215");

        myShop.addProducts("Cereals");
    }

    /**
     * Test case to verify the removal of a product from the shop's inventory.
     */
    @Test
    public void testRemoveProduct(){
        Shop myFoodMart = new Shop("snappyMart", "Boston 02215");

        myFoodMart.removeProduct("Eggs");
    }

    /**
     * Test case to verify the functionality of the delivery notification system.
     */
    @Test
    public void testNotificationSystem(){
        // Create a shop
        Shop myFoodMart = new Shop("snappyMart", "Boston 02215");

        // Create some delivery partners
        TaxiDriver johnCabDriver = new TaxiDriver("John");
        ScooterDriver samScooterDriver = new ScooterDriver("Sam");
        TruckDriver rocoTruckDriver = new TruckDriver("Roco");
        VanDriver alexVanDriver  = new VanDriver("Alex");
        TaxiDriver bobTaxiDriver = new TaxiDriver("Bob");

        // Subscribe the drivers to the shop's delivery manager
        myFoodMart.deliveryManager.subscribe(johnCabDriver);
        myFoodMart.deliveryManager.subscribe(samScooterDriver);
        myFoodMart.deliveryManager.subscribe(rocoTruckDriver);
        myFoodMart.deliveryManager.subscribe(alexVanDriver);
        myFoodMart.deliveryManager.subscribe(bobTaxiDriver);
    
        // Order a product and notify all subscribed drivers
        myFoodMart.orderProduct("Milk", "NY 08372");
        System.err.println();
    }

    /**
     * Test case to verify the unsubscription of drivers from the delivery notification system.
     */
    @Test
    public void testUnsubscribe(){
        // Create a shop
        Shop myFoodMart = new Shop("stop&shop", "Boston 02215");

        // Create some delivery partner drivers
        TaxiDriver d1 = new TaxiDriver("John");
        ScooterDriver d2 = new ScooterDriver("Sam");
        TruckDriver d3 = new TruckDriver("Roco");
        VanDriver d4  = new VanDriver("Alex");
        TaxiDriver d5 = new TaxiDriver("Bob");

        // Subscribe the drivers to the shop's delivery manager
        myFoodMart.deliveryManager.subscribe(d1);
        myFoodMart.deliveryManager.subscribe(d2);
        myFoodMart.deliveryManager.subscribe(d3);
        myFoodMart.deliveryManager.subscribe(d4);
        myFoodMart.deliveryManager.subscribe(d5);

        // Order a product and notify all subscribed drivers
        myFoodMart.orderProduct("Bread", "Commonwealth street,MA 03823");

        // Unsubscribe some drivers
        myFoodMart.deliveryManager.unsubscribe(d1);
        myFoodMart.deliveryManager.unsubscribe(d2);
        
        // Order another product and notify remaining subscribed drivers
        myFoodMart.orderProduct("Vegetables", "Huntington street,MA 29044");
        System.out.println();
    }
}
