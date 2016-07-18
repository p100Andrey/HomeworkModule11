package Homework4;

public class Triangle extends Figure {
    private double sideX, sideY, sideZ;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideX = sideA;
        this.sideY = sideB;
        this.sideZ = sideC;
    }

    @Override
    public double area() {
        int two = 2;
        double halfP = (sideX + sideY + sideZ) / two;
        double area = Math.sqrt(halfP * (halfP - sideX) *
                (halfP - sideY) * (halfP - sideZ));
        return area;
    }
}

