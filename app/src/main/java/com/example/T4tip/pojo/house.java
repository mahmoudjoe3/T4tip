package com.example.T4tip.pojo;

import java.io.Serializable;

public class house implements Serializable {
    public String country,area,houseKind;
    public int num_of_room,num_of_toilet,num_of_cetchen,num_of_reception;

    public house(String country, String area, String houseKind, int num_of_room, int num_of_toilet, int num_of_cetchen, int num_of_reception) {
        this.country = country;
        this.area = area;
        this.houseKind = houseKind;
        this.num_of_room = num_of_room;
        this.num_of_toilet = num_of_toilet;
        this.num_of_cetchen = num_of_cetchen;
        this.num_of_reception = num_of_reception;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHouseKind() {
        return houseKind;
    }

    public void setHouseKind(String houseKind) {
        this.houseKind = houseKind;
    }

    public int getNum_of_room() {
        return num_of_room;
    }

    public void setNum_of_room(int num_of_room) {
        this.num_of_room = num_of_room;
    }

    public int getNum_of_toilet() {
        return num_of_toilet;
    }

    public void setNum_of_toilet(int num_of_toilet) {
        this.num_of_toilet = num_of_toilet;
    }

    public int getNum_of_cetchen() {
        return num_of_cetchen;
    }

    public void setNum_of_cetchen(int num_of_cetchen) {
        this.num_of_cetchen = num_of_cetchen;
    }

    public int getNum_of_reception() {
        return num_of_reception;
    }

    public void setNum_of_reception(int num_of_reception) {
        this.num_of_reception = num_of_reception;
    }
}
