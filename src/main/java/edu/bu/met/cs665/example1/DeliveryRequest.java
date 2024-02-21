package edu.bu.met.cs665.example1;

public class DeliveryRequest {
    // int productId;
    String ProductName;
    String source;
    String destination;

    public DeliveryRequest(String name, String source, String destination){
        this.ProductName = name;
        this.source = source;
        this.destination = destination;
    }
}
