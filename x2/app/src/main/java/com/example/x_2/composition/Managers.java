package com.example.x_2.composition;

public class Managers {
    private int manager_id;
    private String manager_name;

    public Managers(int manager_id, String manager_name) {
        this.manager_id = manager_id;
        this.manager_name = manager_name;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public Managers() {
    }
}
