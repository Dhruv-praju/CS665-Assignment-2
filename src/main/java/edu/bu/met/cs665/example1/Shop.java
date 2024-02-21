package edu.bu.met.cs665.example1;

public class Shop {
    private String name;
    private String location;
    public RequestManager deliveryManager;

    public Shop(String name, String location){
        this.name = name;
        this.location = location;
        this.deliveryManager = new RequestManager();
    }    
    public void addProducts(){

    }
    public void orderProduct(String name, String destination){
        DeliveryRequest dr = new DeliveryRequest(name, this.location, destination);
        this.deliveryManager.notify(dr);
    }   

}
