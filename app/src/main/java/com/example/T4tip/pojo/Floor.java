package com.example.T4tip.pojo;

public class Floor {
    private int ceramicLevel, rokhamLevel, parkehLevel, porselinLevel, HDFLevel;
    private float ceramicCost, rokhamCost, parkehCost, porselinCost, HDFCost;

    public Floor(int ceramicLevel, int rokhamLevel, int parkehLevel, int porselinLevel, int HDFLevel, float ceramicCost, float rokhamCost, float parkehCost, float porselinCost, float HDFCost) {
        this.ceramicLevel = ceramicLevel;
        this.rokhamLevel = rokhamLevel;
        this.parkehLevel = parkehLevel;
        this.porselinLevel = porselinLevel;
        this.HDFLevel = HDFLevel;
        this.ceramicCost = ceramicCost;
        this.rokhamCost = rokhamCost;
        this.parkehCost = parkehCost;
        this.porselinCost = porselinCost;
        this.HDFCost = HDFCost;
    }

    public Floor() {
    }

    public int getCeramicLevel() {
        return ceramicLevel;
    }

    public void setCeramicLevel(int ceramicLevel) {
        this.ceramicLevel = ceramicLevel;
    }

    public int getRokhamLevel() {
        return rokhamLevel;
    }

    public void setRokhamLevel(int rokhamLevel) {
        this.rokhamLevel = rokhamLevel;
    }

    public int getParkehLevel() {
        return parkehLevel;
    }

    public void setParkehLevel(int parkehLevel) {
        this.parkehLevel = parkehLevel;
    }

    public int getPorselinLevel() {
        return porselinLevel;
    }

    public void setPorselinLevel(int porselinLevel) {
        this.porselinLevel = porselinLevel;
    }

    public int getHDFLevel() {
        return HDFLevel;
    }

    public void setHDFLevel(int HDFLevel) {
        this.HDFLevel = HDFLevel;
    }

    public float getCeramicCost() {
        return ceramicCost;
    }

    public void setCeramicCost(float ceramicCost) {
        this.ceramicCost = ceramicCost;
    }

    public float getRokhamCost() {
        return rokhamCost;
    }

    public void setRokhamCost(float rokhamCost) {
        this.rokhamCost = rokhamCost;
    }

    public float getParkehCost() {
        return parkehCost;
    }

    public void setParkehCost(float parkehCost) {
        this.parkehCost = parkehCost;
    }

    public float getPorselinCost() {
        return porselinCost;
    }

    public void setPorselinCost(float porselinCost) {
        this.porselinCost = porselinCost;
    }

    public float getHDFCost() {
        return HDFCost;
    }

    public void setHDFCost(float HDFCost) {
        this.HDFCost = HDFCost;
    }
}
