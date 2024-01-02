package com.epam.mjc.stage0;

public class Animal {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Bird bird = new Bird();

        String dogString = dog.getDescription();

        String birdString = bird.getDescription();

        System.out.println(dogString);

        System.out.println(birdString);

    }

    private String color;

    private int numberOfPaws;

    private boolean hasFur;


    public Animal(String color, int numberOfPaws, boolean hasFur ) {

        this.color = color;

        this.numberOfPaws = numberOfPaws;

        this.hasFur = hasFur;

    }

    public Animal() {
    }

    public void setColor(String color) {

        this.color = color;

    }

    public String getColor() {

        return color;
    }

    public void setNumberOfPaws(int numberOfPaws) {

        this.numberOfPaws = numberOfPaws;

    }

    public int getNumberOfPaws() {

        return numberOfPaws;

    }

    public void setHasFur(boolean hasFur) {

        this.hasFur = hasFur;

    }

    public boolean getHasFur() {

        return hasFur;

    }

    public String getDescription() {

        String colorOne = this.color;

        int numberOfPawsOne  = this.numberOfPaws;

        String numberOfPawsTwo = null;

        if(numberOfPawsOne == 1) {

            numberOfPawsTwo = "paw";

        } else {

            numberOfPawsTwo = "paws";

        }

        boolean hasFur1 = this.hasFur;

        String hasFurTwo = null;

        if(hasFur1 == true) {

            hasFurTwo = "a";

        } else {

            hasFurTwo = "no";

        }

        String animal = "This animal is mostly " + colorOne + "." + " It has " + numberOfPawsOne + " " + numberOfPawsTwo + " and " + hasFurTwo + " fur.";

        return animal;

    }

}
