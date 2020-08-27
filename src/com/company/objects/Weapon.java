package com.company.objects;

public class Weapon extends Object{ //оружие
        private int damage; //урон
        private int blade;//5kg клинок
        private int knife; //2kg нож
        private int axe; //5kg топор
        private int crossbow; //8kg арбалет

    public Weapon(String name, int weight) {
        super();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBlade() {
        return blade;
    }

    public void setBlade(int blade) {
        this.blade = blade;
    }

    public int getKnife() {
        return knife;
    }

    public void setKnife(int knife) {
        this.knife = knife;
    }

    public int getAxe() {
        return axe;
    }

    public void setAxe(int axe) {
        this.axe = axe;
    }

    public int getCrossbow() {
        return crossbow;
    }

    public void setCrossbow(int crossbow) {
        this.crossbow = crossbow;
    }
}
