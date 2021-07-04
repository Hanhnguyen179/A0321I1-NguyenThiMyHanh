package hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        while(choice != 4) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for(int i=0; i<3; i++) {
                        for(int j=1; j<7; j++) {
                            System.out.print("* ");
                            if(j==6) {
                                System.out.print("*\n");
                            }
                        }
                    }
                    break;
                case 2:
                    for(int i=1; i<=5; i++) {
                        for(int j=0; j<i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for(int i=5; i>=0; i--) {
                        for(int j=0; j<i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
