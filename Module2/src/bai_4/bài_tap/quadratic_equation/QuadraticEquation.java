package bai_4.bài_tap.quadratic_equation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;
    double r1;
    double r2;
    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {

        return delta = Math.pow(b, 2) - 4 * a * c;
    }
    public double getRoot1() {
        return r1 = (-b + Math.sqrt(delta)) / (2*a);
    }
    public double getRoot2() {
        return r2 = (-b - Math.sqrt(delta)) / (2*a);
    }
}
