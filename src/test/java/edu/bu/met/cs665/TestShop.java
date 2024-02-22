package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.example1.listeners.drivers.ScooterDriver;
import edu.bu.met.cs665.example1.listeners.drivers.TaxiDriver;
import edu.bu.met.cs665.example1.shop.Shop;

public class TestShop {
    public TestShop(){

    }
    @Test
    public void testAddItemsToShopTest(){
        Shop myFoodMart = new Shop("snappyMart", "Boston 02215");

        myFoodMart.addProducts("Oil", "Fruits");
    }

    @Test
    public void testGetAllProducts(){
        Shop myFoodMart = new Shop("snappyMart", "Boston 02215");

        myFoodMart.addProducts("Cereals");
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
        

        myFoodMart.deliveryManager.subscribe(johnCabDriver);
        myFoodMart.deliveryManager.subscribe(samScooterDriver);
    
        myFoodMart.orderProduct("veg pizza", "NY 08372");
    }
}
