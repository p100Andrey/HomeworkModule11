package Homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        double radius = sc.nextDouble();

        Figure circle = new Circle(radius);
        System.out.println("Площадь круга равна: " + circle.area());

        System.out.println("Введите стороны прямоугольника: ");
        System.out.println("Сторона А: ");
        double sideA = sc.nextDouble();
        System.out.println("Сторона В: ");
        double sideB = sc.nextDouble();

        Figure rectangle = new Rectangle(sideA, sideB);
        System.out.println("Площадь прямоугольника равна: " + rectangle.area());

        System.out.println("Введите стороны треугольника: ");
        System.out.println("Сторона А: ");
        double sideX = sc.nextDouble();
        System.out.println("Сторона B: ");
        double sideY = sc.nextDouble();
        System.out.println("Сторона C: ");
        double sideZ = sc.nextDouble();

        Figure triangle = new Triangle(sideX, sideY, sideZ);
        System.out.println("Площадь треугольника равна: " + triangle.area());
    }
}
