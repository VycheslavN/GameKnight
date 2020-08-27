package com.company.mens;

public class Knight extends Men implements Motion {//рыцарь
    private int weapon;
    private int protection;
    public Knight(int age, int weight, int strength, String name) {
        super(age, weight, strength, name);
    }

    @Override
    public void moveForward() {
        System.out.println("Рыцарь идет вперед");
    }

    @Override
    public void moveBackward() {
        System.out.println("Рыцарь идет назад");
    }

    @Override
    public int attack() {
        System.out.println("Рыцарь атакует");
        return 0;
    }

    @Override
    public int defend() {
        System.out.println("Рыцарь защищается");
        return 0;
    }
    @Override
    public void pass() {
        System.out.println("Рыцарь принимает предмет");
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
}
