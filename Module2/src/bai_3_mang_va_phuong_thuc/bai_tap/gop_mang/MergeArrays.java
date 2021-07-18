package bai_3_mang_va_phuong_thuc.bai_tap.gop_mang;
import java.util.Scanner;
public class MergeArrays {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array 1 size: ");
        int n = scanner.nextInt();
        System.out.print("Enter array 2 size: ");
        int m = scanner.nextInt();
        int[] array1 = new int[n];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        int[] array2 = new int[m];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }
        int[] array3 = new int[n + m];
        i = 0;
        for (int element : array1) {
            array3[i] = element;
            i++;
        }
        for (int element : array2) {
            array3[i] = element;
            i++;
        }
        System.out.print("New array after merging: ");
        for (i=0; i<array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
