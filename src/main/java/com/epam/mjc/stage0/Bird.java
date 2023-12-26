package com.epam.mjc.stage0;

public class Bird extends Animal {
    Bird() {
        super("blue", 2, false);
    }
        @Override
        String getDescription() {
        String paw;
        if(getNumberOfPaws() == 1) {
            paw = "paw";
        } else {
            paw = "paws";
        }
        String fur;
        if(getHasFur() == true) {
            fur = "a";
        } else {
            fur = "no";
        }
        return "This animal is mostly " + getColor() +
        ". It has " + getNumberOfPaws() + " " + paw + " and " + fur + " fur. Moreover, it has 2 wings and can fly.";
        }
}
