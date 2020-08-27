package com.company.objects;

public class Protection extends Object{//защита
        private int armor; //броня
        private int breastplate; //3kg нагрудный щит
        private int hauberk; //8kg кольчуга
        private int helmet; //3kg шлем
        private int shild; //6kg щит

    public Protection(String name, int weight) {
        super();
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getBreastplate() {
        return breastplate;
    }

    public void setBreastplate(int breastplate) {
        this.breastplate = breastplate;
    }

    public int getHauberk() {
        return hauberk;
    }

    public void setHauberk(int hauberk) {
        this.hauberk = hauberk;
    }

    public int getHelmet() {
        return helmet;
    }

    public void setHelmet(int helmet) {
        this.helmet = helmet;
    }

    public int getShild() {
        return shild;
    }

    public void setShild(int shild) {
        this.shild = shild;
    }
}
