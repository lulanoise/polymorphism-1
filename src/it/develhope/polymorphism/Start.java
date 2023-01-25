package it.develhope.polymorphism;

public class Start {
    public static void main(String[] args) {

            Animal lion = new Animal("Mufasa");
            System.out.println(lion.animalSound());
            System.out.println(lion.animalSound("high"));
            System.out.println(lion.animalSound("low"));
            }
    }
