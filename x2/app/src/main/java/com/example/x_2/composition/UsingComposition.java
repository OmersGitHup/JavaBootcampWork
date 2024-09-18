package com.example.x_2.composition;

public class UsingComposition {
    public static void main(String[] args) {
        Categories k1=new Categories(1,"Drama");
        Categories k2=new Categories(2,"Comedy");

        Managers m1=new Managers(1,"Nuri Bilge Ceylan");
        Managers m2=new Managers(2,"Quentin Tarantino");

        Movies f1=new Movies(1,"Django",2013,k1,m1);
        System.out.println("Movie ID="+f1.getMovie_id());
        System.out.println("Movie Name="+f1.getMovie_name());
        System.out.println("Movie Year="+f1.getMovie_year());
        System.out.println("Movie Category="+f1.getCategories().getCategory_name());
        System.out.println("Movie Manager="+f1.getManagers().getManager_name());
    }
}
