package Homework4;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        double pi = Math.PI;
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }
}
