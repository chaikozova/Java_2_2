package com.company;

public class Triangle extends Figure implements Drawable {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("Треугольник");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String draw() { return "\ud83d\udd3a"; }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
