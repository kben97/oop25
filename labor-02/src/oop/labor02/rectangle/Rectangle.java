package oop.labor02.rectangle;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double nlength,double nwidth) {
        length=nlength;
        width=nwidth;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2*length+2*width;
    }
}
