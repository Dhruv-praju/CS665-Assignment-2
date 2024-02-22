package edu.bu.met.cs665.example1.shop;

import java.util.ArrayList;
import java.util.Arrays;

import edu.bu.met.cs665.example1.publisher.RequestManager;

public class Shop {
    private String name;
    private String location;
    private ArrayList<String> items = new ArrayList<String>( Arrays.asList("Milk", "Eggs", "Bread", "Vegetables"));
    public RequestManager deliveryManager;

    public Shop(String name, String location){
        this.name = name;
        this.location = location;
        this.deliveryManager = new RequestManager();
    }   

    public void addProducts(String... products){
        for (String product : products) {
            this.items.add(product);
        }
    }
    public void removeProduct(String name){
        this.items.remove(name);
    }
    public ArrayList<String> getAllProducts(){
        return this.getAllProducts();
    }
    public void orderProduct(String ProductName, String destination){
        DeliveryRequest dr = new DeliveryRequest(this.name, ProductName, this.location, destination);
        this.deliveryManager.notify(dr);
    }   

}
