package com.company.mens;

public class Squire extends Men implements Motion {
    private int weapon;
    private int protection;
    private int rucksak;
    public Squire(int age, int weight, int strength, String name) {
        super(age, weight, strength, name);
            } //оруженосец

    @Override
    public void moveForward() {
        System.out.println("Оруженосец идет вперед");
    }

    @Override
    public void moveBackward() {
        System.out.println("Оруженосец идет назад");
    }

    @Override
    public int attack() {
        System.out.println("Оруженосец атакует");
        return 0;
    }

    @Override
    public int defend() {
        System.out.println("Оруженосец защищается");
        return 0;
    }

    @Override
    public void pass() {
        System.out.println("Оруженосец передает предмет");
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getRucksak() {
        return rucksak;
    }

    public void setRucksak(int rucksak) {
        this.rucksak = rucksak;
    }
}

