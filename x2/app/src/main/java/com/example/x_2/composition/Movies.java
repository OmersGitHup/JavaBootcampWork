package com.example.x_2.composition;

public class Movies {
    private int movie_id;
    private String movie_name;
    private int movie_year;
    private Categories categories;
    private Managers managers;

    public Movies(int movie_id, String movie_name, int movie_year, Categories categories, Managers managers) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_year = movie_year;
        this.categories = categories;
        this.managers = managers;
    }

    public Movies() {
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getMovie_year() {
        return movie_year;
    }

    public void setMovie_year(int movie_year) {
        this.movie_year = movie_year;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Managers getManagers() {
        return managers;
    }

    public void setManagers(Managers managers) {
        this.managers = managers;
    }
}
