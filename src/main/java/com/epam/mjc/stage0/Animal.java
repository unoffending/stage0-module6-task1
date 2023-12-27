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
    String getDescription() {
        String paw;
        if(numberOfPaws == 1) {
            paw = "paw";
        } else {
            paw = "paws";
        }
        String fur;
        if(hasFur) {
            fur = "a";
        } else {
            fur = "no";
        }
        return "This animal is mostly " + color +
        ". It has " + numberOfPaws + " " + paw + " and " + fur + " fur.";
    }

    public String getColor() {
        return color;
    }
    public int getNumberOfPaws() {
        return numberOfPaws;
    }
    public boolean getHasFur() {
        return hasFur;
    }
}
