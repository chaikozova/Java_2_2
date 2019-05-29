package com.company;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(4.0);
        figures[1] = new Rectangle(3.0, 4.5);
        figures[2] = new Square(2.7);
        figures[3] = new Triangle(2.2,4.1,6.5);
        figures[4] = new Rectangle(12.4, 9.8);

        for (int i = 0; i < figures.length ; i++) {
            System.out.println(i + " (" + figures[i].getName()
                    + ((Drawable)figures[i]).draw() + ")"+"Периметр фигуры = "+
                    figures[i].calculatePerimeter());
        }

        Animal dog = new Dog();
        System.out.println((dog.getName() + ((Dog)dog).draw() +
                " Издает звук = " + ((Dog)dog).callSound() ));
    }
}
