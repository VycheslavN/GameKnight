package com.company.mens;

public class Men {
    private int age;
    private int weight;
    private int strength;
    private String name;
    public Men(int age, int weight, int strength, String name){
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



