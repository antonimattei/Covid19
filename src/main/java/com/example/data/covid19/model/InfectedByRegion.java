package com.example.data.covid19.model;

public class InfectedByRegion {
    public String state;
    public int count;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
