package bai_6.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height = 9;

    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(),2) * height;
    }
    @Override
    public String toString() {
        return "A cylinder with height of "
                +getHeight()
                +", volume of "
                +getVolume()
                +", and is a subclass of "
                + super.toString()
                ;
    }
}
