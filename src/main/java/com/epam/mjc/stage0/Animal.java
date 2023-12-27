package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    
    Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    
    protected String getDescription() {
        String paws;
        String fur;
        if(numberOfPaws == 1) {
            paws = "paw";
        } else {
            paws = "paws";
        }
        if(hasFur) {
            fur = "a";
        } else {
            fur = "no";
        }
        return "This animal is mostly " + color + ". It has " 
                + numberOfPaws + " " + paws + " and " + fur + " fur.";
    }
   
}
