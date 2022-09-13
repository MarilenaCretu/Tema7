package org.fasttrackit.animal;

public class Cat implements Animal{

    public String name = "PISICA";

    @Override
    public String walk() {
        return "4 picioare";
    }

    @Override
    public String talk() {
        return "miau-miau";
    }

    @Override
    public String eat() {
        return "soricei";
    }

    @Override
    public String getWalk() {
        return walk();
    }

    @Override
    public String getTalk() {
        return talk();
    }

    @Override
    public String getEat() {
        return eat();
    }

    @Override
    public String getName() {
        return name;
    }
}
