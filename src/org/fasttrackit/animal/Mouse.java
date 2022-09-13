package org.fasttrackit.animal;

public class Mouse implements Animal{
    public String name = "SORICEL";
    @Override
    public String walk() {
        return "4 picioare";
    }

    @Override
    public String talk() {
        return "chit-chit";
    }

    @Override
    public String eat() {
        return "branza";
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
