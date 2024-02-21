package edu.bu.met.cs665.example1;

public class TaxiDriver implements RequestListener{
    public void update(DeliveryRequest dr){
        System.out.println("Taxi Driver is notified for the delivery");
    }
}