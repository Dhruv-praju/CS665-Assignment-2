package edu.bu.met.cs665.example1;

import java.util.ArrayList;

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
