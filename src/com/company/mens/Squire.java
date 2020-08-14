package com.company.mens;

public class Squire extends Men implements Motion {
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
}

