package com.yunusbagriyanik.designpatterns.cretional.prototype.example1;

public abstract class Shape implements Cloneable {
    int X;
    int Y;
    String color;

    public Shape() {
    }

    public Shape(Shape source) {
        if (source != null) {
            this.X = source.X;
            this.Y = source.Y;
            this.color = source.color;
        }
    }

    public abstract Shape clone();
}
