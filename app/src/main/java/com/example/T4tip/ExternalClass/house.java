package com.example.T4tip.ExternalClass;

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
}
