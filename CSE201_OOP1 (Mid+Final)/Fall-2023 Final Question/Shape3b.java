public class Shape3b {
    private String color;
    private boolean filled_status;

    Shape(String color, boolean filled_status) {
        this.color = color;
        this.filled_status = filled_status;
    }
}
// SubClass Circle
public class Circle extends Shape {
    private double radius;

    Circle (String color, boolean filled_status, double radius) {
        super(color, filled_status);
        this.radius = radius;
    }

    public double circleArea() {
        return (3.1416*radius*radius);
    }
}
//SubClass Rectangle
public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String color, boolean filled_status, double width, double height) {
        super(color, filled_status);
        this.width = width;
        this.height = height;
    }

    public double rectangleArea() {
        return (height*width);
    }
}
