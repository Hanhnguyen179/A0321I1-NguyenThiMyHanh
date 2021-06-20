package doc_so_thanh_chu;
import java.util.Scanner;
public class ReadNumberInWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer with no more than 3 digits: ");
        int number = scanner.nextInt();
        String result;

            switch (number) {
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";
                    break;
                default:
                    result = "";
            }
            if (result != "") {
                System.out.printf(result);
            }
            if (result == "") {
                System.out.printf("Out of ability");
            }
        }
    }

