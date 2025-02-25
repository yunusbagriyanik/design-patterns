package com.yunusbagriyanik.designpatterns.cretional.prototype.example1;

import java.util.ArrayList;
import java.util.List;

public class PrototypePatternMain {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.X = 10;
        circle.Y = 20;
        circle.radius = 15;
        circle.color = "Red";
        shapes.add(circle);

        Shape anotherCircle = circle.clone();
        anotherCircle.color = "Blue";
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.X = 5;
        rectangle.Y = 5;
        rectangle.width = 30;
        rectangle.height = 40;
        rectangle.color = "Green";
        shapes.add(rectangle);

        Shape anotherRectangle = rectangle.clone();
        anotherRectangle.color = "Yellow";
        shapes.add(anotherRectangle);

        shapes.forEach(System.out::println);
    }
}
