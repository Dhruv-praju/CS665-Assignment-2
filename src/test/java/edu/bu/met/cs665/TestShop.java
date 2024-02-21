package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.example1.Shop;
import edu.bu.met.cs665.example1.TaxiDriver;

public class TestShop {
    public TestShop(){

    }

    @Test
    public void TestNotificationSystem(){
        Shop myFoodMart = new Shop("snappyMart", "Boston 02215");
        TaxiDriver johnDriver = new TaxiDriver();
        myFoodMart.deliveryManager.subscribe(johnDriver);
    
        myFoodMart.orderProduct("veg pizza", "NY 08372");
    }
}
