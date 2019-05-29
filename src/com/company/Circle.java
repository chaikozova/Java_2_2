package com.company;

public class Circle extends Figure implements Drawable {
    private double radius;
    private final double PI = 3.14;

    public Circle (double radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "\u26AB";
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
