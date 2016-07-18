package Homework4;

public class Rectangle extends Figure {
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        double area = sideA * sideB;
        return area;
    }
}
