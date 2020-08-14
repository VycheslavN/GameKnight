package com.company.mens;

public class Knight extends Men implements Motion {//рыцарь
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
}
