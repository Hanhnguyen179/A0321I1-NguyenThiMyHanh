package bai_5.bai_tap.access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1;
        color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return (Math.PI*Math.pow(radius,2));
    }
}
