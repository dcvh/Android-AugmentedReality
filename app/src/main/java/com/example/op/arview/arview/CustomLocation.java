package com.example.op.arview.arview;

/**
 * Created by OP on 4/9/2017.
 */

public class CustomLocation {
    public String status;
    public Data[] data;

    CustomLocation() {
        data = new Data[1];

    }

    public CustomLocation(Data [] data) {
        this.data = data;
    }
}
class Data {
    String name ="";
    Float lat = 0f;
    Float lon = 0f;
    String img = "";

    public Data(String name, Float lat, Float lon, String img) {
        this.name = name;
        this.lat = lat;
        this.lon= lon;
        this.img = img;
    }
}
