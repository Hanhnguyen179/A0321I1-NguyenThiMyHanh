package bai_4.bài_tap.quadratic_equation;
import java.util.Scanner;
public class Execute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = scanner.nextDouble();
        System.out.print("Enter b:");
        double b = scanner.nextDouble();
        System.out.print("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if(delta>0) {
            System.out.println("The equation has two roots: \n r1 = " + quadraticEquation.getRoot1() + " and r2 = " + quadraticEquation.getRoot2());
        }
        if(delta<0){
            System.out.println("The equation has no roots");
        }
        else {
            System.out.println("The equation has one root: \n r = " + quadraticEquation.getRoot1());
        }
    }
}

