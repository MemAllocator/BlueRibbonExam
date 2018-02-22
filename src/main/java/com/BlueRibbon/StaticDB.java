package com.BlueRibbon;

import java.util.ArrayList;

/**
 * Created by omer on 2/22/2018.
 */
public class StaticDB {
private ArrayList<Long> ticketId;
private ArrayList<Long> destinationId;
private ArrayList<String> baggageId;
private ArrayList<Long> couponId;
private ArrayList<Double> price;
private ArrayList<Double> fixedPrice;

public StaticDB(){
    ticketId = new ArrayList<>();
    destinationId = new ArrayList<>();
    baggageId = new ArrayList<>();
    couponId = new ArrayList<>();
    price = new ArrayList<>();
    fixedPrice = new ArrayList<>();
    ticketId.add(123456L);
    ticketId.add(34556L);
    ticketId.add(656456L);
    destinationId.add(55556L);
    destinationId.add(444L);
    destinationId.add(777L);
    baggageId.add("bbbf");
    baggageId.add("ffffg");
    baggageId.add("111");
    couponId.add(111L);
    couponId.add(222L);
    couponId.add(333L);
    price.add(34.5);
    price.add(55.6);
    price.add(66.4);
    fixedPrice.add(0.1);
    fixedPrice.add(0.5);
    fixedPrice.add(0.6);

}

    public ArrayList<Long> getTicketId() {
        return ticketId;
    }

    public void setTicketId(ArrayList<Long> ticketId) {
        this.ticketId = ticketId;
    }

    public ArrayList<Long> getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(ArrayList<Long> destinationId) {
        this.destinationId = destinationId;
    }

    public ArrayList<String> getBaggageId() {
        return baggageId;
    }

    public void setBaggageId(ArrayList<String> baggageId) {
        this.baggageId = baggageId;
    }

    public ArrayList<Long> getCouponId() {
        return couponId;
    }

    public void setCouponId(ArrayList<Long> couponId) {
        this.couponId = couponId;
    }

    public ArrayList<Double> getPrice() {
        return price;
    }

    public ArrayList<Double> getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(ArrayList<Double> fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public void setPrice(ArrayList<Double> price) {
        this.price = price;
    }
}
