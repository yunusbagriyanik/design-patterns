package com.yunusbagriyanik.designpatterns.cretional.prototype.example1;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return String.format("Rectangle{X=%d, Y=%d, width=%d, height=%d, color=%s}", X, Y, width, height, color);
    }
}
