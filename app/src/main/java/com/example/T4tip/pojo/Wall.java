package com.example.T4tip.pojo;

public class Wall {
    private int normalPaintLevel, decorPaintLevel, wallPaperLevel;
    private float normalPaintCost, decorPaintCost, wallPaperCost;

    public Wall() {
    }

    public Wall(int normalPaintLevel, int decorPaintLevel, int wallPaperLevel, float normalPaintCost, float decorPaintCost, float wallPaperCost) {
        this.normalPaintLevel = normalPaintLevel;
        this.decorPaintLevel = decorPaintLevel;
        this.wallPaperLevel = wallPaperLevel;
        this.normalPaintCost = normalPaintCost;
        this.decorPaintCost = decorPaintCost;
        this.wallPaperCost = wallPaperCost;
    }

    public int getNormalPaintLevel() {
        return normalPaintLevel;
    }

    public void setNormalPaintLevel(int normalPaintLevel) {
        this.normalPaintLevel = normalPaintLevel;
    }

    public int getDecorPaintLevel() {
        return decorPaintLevel;
    }

    public void setDecorPaintLevel(int decorPaintLevel) {
        this.decorPaintLevel = decorPaintLevel;
    }

    public int getWallPaperLevel() {
        return wallPaperLevel;
    }

    public void setWallPaperLevel(int wallPaperLevel) {
        this.wallPaperLevel = wallPaperLevel;
    }

    public float getNormalPaintCost() {
        return normalPaintCost;
    }

    public void setNormalPaintCost(float normalPaintCost) {
        this.normalPaintCost = normalPaintCost;
    }

    public float getDecorPaintCost() {
        return decorPaintCost;
    }

    public void setDecorPaintCost(float decorPaintCost) {
        this.decorPaintCost = decorPaintCost;
    }

    public float getWallPaperCost() {
        return wallPaperCost;
    }

    public void setWallPaperCost(float wallPaperCost) {
        this.wallPaperCost = wallPaperCost;
    }
}
