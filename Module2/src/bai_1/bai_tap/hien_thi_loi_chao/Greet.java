package bai_1.bai_tap.hien_thi_loi_chao;
import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
