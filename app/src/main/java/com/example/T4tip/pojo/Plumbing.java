package com.example.T4tip.pojo;

public class Plumbing {
    private boolean dishMachine, clothesMachine, waterFilter, basin;
    private boolean banio, dosh, a3da, normalBanio, jakozi;

    public Plumbing(boolean basin, boolean banio, boolean dosh, boolean a3da, boolean normalBanio, boolean jakozi) {
        this.basin = basin;
        this.banio = banio;
        this.dosh = dosh;
        this.a3da = a3da;
        this.normalBanio = normalBanio;
        this.jakozi = jakozi;
    }

    public Plumbing(boolean dishMachine, boolean clothesMachine, boolean waterFilter, boolean basin) {
        this.dishMachine = dishMachine;
        this.clothesMachine = clothesMachine;
        this.waterFilter = waterFilter;
        this.basin = basin;
    }

    public boolean isDishMachine() {
        return dishMachine;
    }

    public void setDishMachine(boolean dishMachine) {
        this.dishMachine = dishMachine;
    }

    public boolean isClothesMachine() {
        return clothesMachine;
    }

    public void setClothesMachine(boolean clothesMachine) {
        this.clothesMachine = clothesMachine;
    }

    public boolean isWaterFilter() {
        return waterFilter;
    }

    public void setWaterFilter(boolean waterFilter) {
        this.waterFilter = waterFilter;
    }

    public boolean isBasin() {
        return basin;
    }

    public void setBasin(boolean basin) {
        this.basin = basin;
    }

    public boolean isBanio() {
        return banio;
    }

    public void setBanio(boolean banio) {
        this.banio = banio;
    }

    public boolean isDosh() {
        return dosh;
    }

    public void setDosh(boolean dosh) {
        this.dosh = dosh;
    }

    public boolean isA3da() {
        return a3da;
    }

    public void setA3da(boolean a3da) {
        this.a3da = a3da;
    }

    public boolean isNormalBanio() {
        return normalBanio;
    }

    public void setNormalBanio(boolean normalBanio) {
        this.normalBanio = normalBanio;
    }

    public boolean isJakozi() {
        return jakozi;
    }

    public void setJakozi(boolean jakozi) {
        this.jakozi = jakozi;
    }
}
