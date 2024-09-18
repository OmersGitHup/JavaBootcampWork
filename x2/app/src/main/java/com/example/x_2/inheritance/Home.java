package com.example.x_2.inheritance;

public class Home {
    public Home() {
    }

    public int getWindowCount() {
        return windowCount;
    }

    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }

    private int windowCount;

    public Home(int windowCount) {
        this.windowCount = windowCount;
    }
}
