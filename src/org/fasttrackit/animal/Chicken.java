package org.fasttrackit.animal;

public class Chicken implements Animal{

    public String name = "PUI";
    @Override
    public String walk() {
        return "2 picioare";
    }

    @Override
    public String talk() {
        return "pui-pui";
    }

    @Override
    public String eat() {
        return "malai";
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
