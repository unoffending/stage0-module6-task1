package com.epam.mjc.stage0;

public class Bird extends Animal {
    Bird() {
        super("blue", 2, false);
    }
        String getDescription(Bird bird) {
        String paw;
        if(bird.getNumberOfPaws() == 1) {
            paw = "paw";
        } else {
            paw = "paws";
        }
        String fur;
        if(bird.getHasFur() == true) {
            fur = "a";
        } else {
            fur = "no";
        }
        return "This animal is mostly " + bird.getColor() +
        ". It has " + bird.getNumberOfPaws() + " " + paw + " and " + fur + " fur. Moreover, it has 2 wings and can fly.";
        }
}
