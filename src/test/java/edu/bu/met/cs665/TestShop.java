package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.example1.listeners.drivers.ScooterDriver;
import edu.bu.met.cs665.example1.listeners.drivers.TaxiDriver;
import edu.bu.met.cs665.example1.listeners.drivers.TruckDriver;
import edu.bu.met.cs665.example1.listeners.drivers.VanDriver;
import edu.bu.met.cs665.example1.shop.Shop;

public class TestShop {
    public TestShop(){

    }
    @Test
    public void testAddItemsToShopTest(){
        Shop myFoodMart = new Shop("7-Eleven", "Boston 02215");

        myFoodMart.addProducts("Oil", "Fruits");
    }

    @Test
    public void testGetAllProducts(){
        Shop myShop = new Shop("star market", "Boston 02215");

        myShop.addProducts("Cereals");
    }

    @Test
    public void testRemoveProduct(){
        Shop myFoodMart = new Shop("snappyMart", "Boston 02215");

        myFoodMart.removeProduct("Eggs");
    }

    @Test
    public void testNotificationSystem(){
        // made a shop
        Shop myFoodMart = new Shop("snappyMart", "Boston 02215");

        // some delivery partners
        TaxiDriver johnCabDriver = new TaxiDriver("John");
        ScooterDriver samScooterDriver = new ScooterDriver("Sam");
        TruckDriver rocoTruckDriver = new TruckDriver("Roco");
        VanDriver alexVanDriver  = new VanDriver("Alex");
        TaxiDriver bobTaxiDriver = new TaxiDriver("Bob");

        myFoodMart.deliveryManager.subscribe(johnCabDriver);
        myFoodMart.deliveryManager.subscribe(samScooterDriver);
        myFoodMart.deliveryManager.subscribe(rocoTruckDriver);
        myFoodMart.deliveryManager.subscribe(alexVanDriver);
        myFoodMart.deliveryManager.subscribe(bobTaxiDriver);
    
        myFoodMart.orderProduct("Milk", "NY 08372");
        
    }

    @Test
    public void testUnsubscribe(){
        // made a shop
        Shop myFoodMart = new Shop("stop&shop", "Boston 02215");

        // some delivery partners
        TaxiDriver d1 = new TaxiDriver("John");
        ScooterDriver d2 = new ScooterDriver("Sam");
        TruckDriver d3 = new TruckDriver("Roco");
        VanDriver d4  = new VanDriver("Alex");
        TaxiDriver d5 = new TaxiDriver("Bob");

        myFoodMart.deliveryManager.subscribe(d1);
        myFoodMart.deliveryManager.subscribe(d2);
        myFoodMart.deliveryManager.subscribe(d3);
        myFoodMart.deliveryManager.subscribe(d4);
        myFoodMart.deliveryManager.subscribe(d5);

        myFoodMart.orderProduct("Bread", "Commonwealth street,MA 03823");

        myFoodMart.deliveryManager.unsubscribe(d1);
        myFoodMart.deliveryManager.unsubscribe(d2);
        
        myFoodMart.orderProduct("Vegetables", "Huntington street,MA 29044");
        System.out.println();
    }
}
