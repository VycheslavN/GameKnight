package com.company.objects;

import java.util.ArrayList;
import java.util.HashMap;

public class Rucksak {
    HashMap<Integer, ArrayList> rucksak = new HashMap<>();
    ArrayList<Weapon> weapon = new ArrayList<>();
    ArrayList<Protection> protection = new ArrayList<>();
    public String name;
    public int weight;
    public Rucksak(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
        this.rucksak.put(0, weapon);
        this.rucksak.put(1, protection);
    }
    void makeDefault() {

        weapon = rucksak.get(0);
        weapon.add(new Weapon("Клинок", 6));
        weapon.add(new Weapon("Нож", 2));
        weapon.add(new Weapon("Топор", 5));
        weapon.add(new Weapon("Арбалет", 8));
        rucksak.put(0,weapon);

        protection = rucksak.get(1);
        protection.add(new Protection("Нагрудный щит", 3));
        protection.add(new Protection("Кольчуга", 9));
        protection.add(new Protection("Шлем", 3));
        protection.add(new Protection("Щит", 10));
        rucksak.put(1,protection);
    }
}

