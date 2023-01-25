package it.develhope.polymorphism;

public class Animal {
    public String animalName; //public or private

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String animalSound() {
        return "Roarr!";
    }

    public String animalSound(String intensity) {
        if (intensity.equals("high")) {
            return "Roarrrrrrrr!";
        } else if (intensity.equals("low")) {
            return "Roar";
        } else {
            return "Cannot reproduce it properly";
        }
    }
}