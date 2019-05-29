package com.company;

public class Square extends Figure implements Drawable {

    private double side;

    public Square (double side) {
        super ("Квадрат");
        this.side = side;
    }

    @Override
    public String draw() {
        return "\u2B1B";
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }
}
