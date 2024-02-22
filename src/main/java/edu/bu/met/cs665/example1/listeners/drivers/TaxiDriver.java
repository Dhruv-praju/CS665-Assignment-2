package edu.bu.met.cs665.example1.listeners.drivers;

import edu.bu.met.cs665.example1.listeners.Driver;
import edu.bu.met.cs665.example1.shop.DeliveryRequest;

public class TaxiDriver implements Driver{
    private String name;

    public TaxiDriver(String name){
        this.name=name;
    }
    public void update(DeliveryRequest dr){
        System.out.println(this.name+ " taxi Driver is notified for the delivery of "+ dr.getProductName()+" from "+dr.getShopName()+" "+dr.getSource()+" to "+dr.getDestination());
    }
}