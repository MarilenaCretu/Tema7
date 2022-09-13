package org.fasttrackit.animal;

public class Duck implements Animal{

    public String name = "RATA";
    @Override
    public String walk() {
        return "2 picioare";
    }

    @Override
    public String talk() {
        return "mac-mac";
    }

    @Override
    public String eat() {
        return "iarba";
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
