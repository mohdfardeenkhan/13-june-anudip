package practice;

abstract class Shape {
    abstract double calculateArea();
}
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Circle extends Shape {
    private double radius;
    private static final double PI = 3.141592653589793;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI * radius * radius;
    }
}

public class Shapes {
    public static void main(String[] args) {
        // Create instances of Square and Circle
        Shape square = new Square(5); // Side length of 5
        Shape circle = new Circle(3); // Radius of 3
        
        // Calculate and print the area of the Square
        System.out.println("Area of the square: " + square.calculateArea());
        
        // Calculate and print the area of the Circle
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}

