package bai_5.bai_tap.access_modifier;
import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle's radius:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.print("Radius: ");
        System.out.println(circle.getRadius());
        System.out.print("Area: ");
        System.out.println(circle.getArea());
    }
}
