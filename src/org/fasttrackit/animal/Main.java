package org.fasttrackit.animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Mouse());
        animals.add(new Chicken());
        animals.add(new Duck());

        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.getName() + " merge cu " + animal.getWalk() + ", face " + animal.getTalk() + " si mananca " + animal.getEat());
        }
    }
}
