package com.inhataxi.model;

public class ChatRoomItem {

    private String name;
    private String dept;
    private int count;
    private String time;
    private double distance;
    private String departure;
    private String destination;
    private String imageUrl;

    public ChatRoomItem(String name, String dept, int count, String time, double distance, String departure, String destination, String imageUrl){
        this.name = name;
        this.dept = dept;
        this. count = count;
        this.time = time;
        this.distance = distance;
        this.departure = departure;
        this.destination = destination;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getCount() {
        return count;
    }

    public String getTime() {
        return time;
    }

    public double getDistance() {
        return distance;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
