package com.yunusbagriyanik.designpatterns.cretional.prototype.example1;

public class Circle extends Shape {
    int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return String.format("Circle{X=%d, Y=%d, radius=%d, color=%s}", X, Y, radius, color);
    }
}
