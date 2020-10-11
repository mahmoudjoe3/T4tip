package com.example.T4tip.pojo;

public class Roof {
    private int paintLevel, masseesLevel, GPLevel;
    private float paintCost, masseesCost, GPCost;

    public Roof() {
    }

    public Roof(int paintLevel, int masseesLevel, int GPLevel, float paintCost, float masseesCost, float GPCost) {
        this.paintLevel = paintLevel;
        this.masseesLevel = masseesLevel;
        this.GPLevel = GPLevel;
        this.paintCost = paintCost;
        this.masseesCost = masseesCost;
        this.GPCost = GPCost;
    }

    public int getPaintLevel() {
        return paintLevel;
    }

    public void setPaintLevel(int paintLevel) {
        this.paintLevel = paintLevel;
    }

    public int getMasseesLevel() {
        return masseesLevel;
    }

    public void setMasseesLevel(int masseesLevel) {
        this.masseesLevel = masseesLevel;
    }

    public int getGPLevel() {
        return GPLevel;
    }

    public void setGPLevel(int GPLevel) {
        this.GPLevel = GPLevel;
    }

    public float getPaintCost() {
        return paintCost;
    }

    public void setPaintCost(float paintCost) {
        this.paintCost = paintCost;
    }

    public float getMasseesCost() {
        return masseesCost;
    }

    public void setMasseesCost(float masseesCost) {
        this.masseesCost = masseesCost;
    }

    public float getGPCost() {
        return GPCost;
    }

    public void setGPCost(float GPCost) {
        this.GPCost = GPCost;
    }
}
