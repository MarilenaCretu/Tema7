package org.fasttrackit.animal;

public class Dog implements Animal{
    public String name = "CAINE";
    @Override
    public String walk() {
        return "4 picioare";
    }

    @Override
    public String talk() {
        return "ham-ham";
    }

    @Override
    public String eat() {
        return "oase";
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
