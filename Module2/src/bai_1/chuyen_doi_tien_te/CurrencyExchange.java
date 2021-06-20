package chuyen_doi_tien_te;
import java.util.Scanner;
public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money in USD: ");
        double usd = scanner.nextDouble();
        double vnd = usd * 23500;
        System.out.println(usd + " USD equals to " + vnd + " VND");
    }
}
