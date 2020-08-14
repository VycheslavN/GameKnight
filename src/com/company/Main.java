package com.company;

import com.company.mens.Knight;

public class Main {

    public static void main(String[] args) {

        Knight jon = new Knight(22, 50, 88, "jon");
        jon.attack();
        jon.defend();
        System.out.println(jon.getName());
    }
}
