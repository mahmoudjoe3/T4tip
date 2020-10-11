package com.example.T4tip.pojo;

public class Electrictiy {
    private int numberOfPoints, materialLevel;
    private float totalCost;

    public Electrictiy(int numberOfPoints, int materialLevel, float totalCost) {
        this.numberOfPoints = numberOfPoints;
        this.materialLevel = materialLevel;
        this.totalCost = totalCost;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getMaterialLevel() {
        return materialLevel;
    }

    public void setMaterialLevel(int materialLevel) {
        this.materialLevel = materialLevel;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
}
