package com.home.triaxyd;

public class AnimalsID {
    private static int id;
    private static int weight;
    private static int age;
    private static String name,homotaxy;

    public static void setId(int newId){
        id=newId;
    }

    public static int getId() {
        return id;
    }
    public static void setWeight(int newWeight){
        weight=newWeight;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setName(String newName){
        name=newName;
    }

    public static String getName() {
        return name;
    }

    public static void setAge(int newAge){
        age=newAge;
    }

    public static int getAge() {
        return age;
    }

    public static void setHomotaxy(String newHomotaxy){
        homotaxy=newHomotaxy;
    }

    public static String getHomotaxy() {
        return homotaxy;
    }

}

