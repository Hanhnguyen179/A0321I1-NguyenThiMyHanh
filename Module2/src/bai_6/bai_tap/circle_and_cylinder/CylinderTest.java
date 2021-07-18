package bai_6.bai_tap.circle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(15);
        System.out.println(cylinder);

        cylinder = new Cylinder(8, 3, "yellow");
        System.out.println(cylinder);
    }
}
