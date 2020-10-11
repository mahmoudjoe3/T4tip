package com.example.T4tip.pojo;

public class Unit {
    private float length, width, height, totalCost;
    private String unitKind;
    private Furniture furniture;
    private Electrictiy electrictiy;
    private Wall wall;
    private Roof roof;
    private Floor floor;
    private Plumbing plumbing;


    //Constructor for kitchen and toilet
    public Unit(float length, float width, float height, float totalCost, String unitKind, Furniture furniture, Electrictiy electrictiy, Wall wall, Roof roof, Floor floor, Plumbing plumbing) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.totalCost = totalCost;
        this.unitKind = unitKind;
        this.furniture = furniture;
        this.electrictiy = electrictiy;
        this.wall = wall;
        this.roof = roof;
        this.floor = floor;
        this.plumbing = plumbing;
    }

    //Constructor for room and reception
    public Unit(float length, float width, float height, float totalCost, String unitKind, Furniture furniture, Electrictiy electrictiy, Wall wall, Roof roof, Floor floor) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.totalCost = totalCost;
        this.unitKind = unitKind;
        this.furniture = furniture;
        this.electrictiy = electrictiy;
        this.wall = wall;
        this.roof = roof;
        this.floor = floor;
    }
}
