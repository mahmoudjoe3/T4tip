package com.example.T4tip.pojo;

public class Furniture {
    private int doorsCount, windowsCount;
    private float doorLength, doorWidth, doorTotalCost;
    private float windowLength, windowWidth, windowsTotalCost;
    private String doorKind, windowKind;

    public Furniture(int doorsCount, int windowsCount, float doorLength, float doorWidth, float doorTotalCost, float windowLength, float windowWidth, float windowsTotalCost, String doorKind, String windowKind) {
        this.doorsCount = doorsCount;
        this.windowsCount = windowsCount;
        this.doorLength = doorLength;
        this.doorWidth = doorWidth;
        this.doorTotalCost = doorTotalCost;
        this.windowLength = windowLength;
        this.windowWidth = windowWidth;
        this.windowsTotalCost = windowsTotalCost;
        this.doorKind = doorKind;
        this.windowKind = windowKind;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    public void setWindowsCount(int windowsCount) {
        this.windowsCount = windowsCount;
    }

    public float getDoorLength() {
        return doorLength;
    }

    public void setDoorLength(float doorLength) {
        this.doorLength = doorLength;
    }

    public float getDoorWidth() {
        return doorWidth;
    }

    public void setDoorWidth(float doorWidth) {
        this.doorWidth = doorWidth;
    }

    public float getDoorTotalCost() {
        return doorTotalCost;
    }

    public void setDoorTotalCost(float doorTotalCost) {
        this.doorTotalCost = doorTotalCost;
    }

    public float getWindowLength() {
        return windowLength;
    }

    public void setWindowLength(float windowLength) {
        this.windowLength = windowLength;
    }

    public float getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(float windowWidth) {
        this.windowWidth = windowWidth;
    }

    public float getWindowsTotalCost() {
        return windowsTotalCost;
    }

    public void setWindowsTotalCost(float windowsTotalCost) {
        this.windowsTotalCost = windowsTotalCost;
    }

    public String getDoorKind() {
        return doorKind;
    }

    public void setDoorKind(String doorKind) {
        this.doorKind = doorKind;
    }

    public String getWindowKind() {
        return windowKind;
    }

    public void setWindowKind(String windowKind) {
        this.windowKind = windowKind;
    }
}
