package edu.bu.met.cs665.example1.shop;

public class DeliveryRequest {
    // int productId;
    private String ProductName;
    private String shopName;
    private String source;
    private String destination;


    public DeliveryRequest(String shopName, String Productname, String source, String destination){
        this.shopName = shopName;
        this.ProductName = Productname;
        this.source = source;
        this.destination = destination;
    }

    public String getShopName() {
        return shopName;
    }
    public String getProductName() {
        return ProductName;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }

}
