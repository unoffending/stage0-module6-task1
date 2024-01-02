package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {

        super.setColor("blue");

        super.setNumberOfPaws(2);

        super.setHasFur(false);

    }

    @Override
    public String getDescription() {

        String colorOne = super.getColor();

        int numberOfPawsOne  = super.getNumberOfPaws();

        String numberOfPawsTwo = null;

        if(numberOfPawsOne == 1) {

            numberOfPawsTwo = "paw";

        } else {

            numberOfPawsTwo = "paws";

        }

        boolean hasFur1 = super.getHasFur();

        String hasFurTwo = null;

        if(hasFur1 == true) {

            hasFurTwo = "a";

        } else {

            hasFurTwo = "no";

        }

        String animal = "This animal is mostly " + colorOne + "." + " It has " + numberOfPawsOne + " " + numberOfPawsTwo + " and " + hasFurTwo + " fur. Moreover, it has 2 wings and can fly.";

        return animal;

    }

}
