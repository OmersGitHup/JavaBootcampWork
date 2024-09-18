package com.example.x_2.inheritance;

public class Palace extends Home{
    private int towerCount;

    public Palace() {
    }

    public Palace(int towerCount) {
        this.towerCount = towerCount;
    }

    public int getTowerCount() {
        return towerCount;
    }

    public void setTowerCount(int towerCount) {
        this.towerCount = towerCount;
    }
}
