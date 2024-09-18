package com.example.x_2.inheritance;

public class Villa extends Home {
    private boolean park;

    public boolean isPark() {
        return park;
    }

    public void setPark(boolean park) {
        this.park = park;
    }

    public Villa(boolean park) {
        this.park = park;
    }

    public Villa() {
    }
}
