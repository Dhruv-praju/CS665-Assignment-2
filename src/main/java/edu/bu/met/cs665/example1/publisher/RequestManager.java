package edu.bu.met.cs665.example1.publisher;

import java.util.ArrayList;

import edu.bu.met.cs665.example1.listeners.RequestListener;
import edu.bu.met.cs665.example1.shop.DeliveryRequest;

public class RequestManager {
    private ArrayList<RequestListener> listeners;

    public RequestManager(){
        this.listeners = new ArrayList<>();
    }

    public void subscribe(RequestListener driver){
        this.listeners.add(driver);
    }
    public void unsubscribe(RequestListener driver){
        this.listeners.remove(driver);
    }
    public void notify( DeliveryRequest dr ){
        for (RequestListener driver : this.listeners) {
            driver.update(dr);
        }
    }
}
