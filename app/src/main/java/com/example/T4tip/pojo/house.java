package com.example.T4tip.pojo;



import java.io.Serializable;
import java.util.ArrayList;

public class house implements Serializable {
    private String country,area,houseKind;
    private int num_of_room,num_of_toilet, num_of_kitchen,num_of_reception;
    private ArrayList<Unit> rooms, kitchens, receptions, toilets;

    public house(String country, String area, String houseKind, int num_of_room, int num_of_toilet, int num_of_kitchen, int num_of_reception) {
        this.country = country;
        this.area = area;
        this.houseKind = houseKind;
        this.num_of_room = num_of_room;
        this.num_of_toilet = num_of_toilet;
        this.num_of_kitchen = num_of_kitchen;
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

    public int getNum_of_kitchen() {
        return num_of_kitchen;
    }

    public void setNum_of_kitchen(int num_of_kitchen) {
        this.num_of_kitchen = num_of_kitchen;
    }

    public int getNum_of_reception() {
        return num_of_reception;
    }

    public void setNum_of_reception(int num_of_reception) {
        this.num_of_reception = num_of_reception;
    }
}
