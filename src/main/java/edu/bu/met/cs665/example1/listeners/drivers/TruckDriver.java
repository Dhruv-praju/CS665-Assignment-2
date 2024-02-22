package edu.bu.met.cs665.example1.listeners.drivers;

import edu.bu.met.cs665.example1.listeners.Driver;
import edu.bu.met.cs665.example1.shop.DeliveryRequest;

public class TruckDriver implements Driver{
    private String name;

    public TruckDriver(String name){
        this.name=name;
    }
    public void update(DeliveryRequest dr){
        System.out.println(this.name+ " Taxi Driver is notified for the delivery of "+ dr.getProductName()+" from "+dr.getShopName()+" "+dr.getSource()+" to "+dr.getDestination());
    }
}
