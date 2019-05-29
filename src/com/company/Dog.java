package com.company;

public class Dog extends Animal implements Drawable, SoundProducable{

    public Dog () {
        super("Пёсик");
    }

    @Override
    public String draw () {
        return "🐕";
    }

    @Override
    public String callSound () {
        return "гав - гав";
    }
}
