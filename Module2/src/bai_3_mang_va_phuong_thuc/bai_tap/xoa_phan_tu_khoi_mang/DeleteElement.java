package bai_3_mang_va_phuong_thuc.bai_tap.xoa_phan_tu_khoi_mang;
import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        int i = 0;

        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter the element you want to delete: ");
        int X = scanner.nextInt();
        int index_del = SearchElement(array,X);
        if (index_del == -1) {
            System.out.println("Not found the element");
        }
        for (i = index_del; i < array.length; i++) {
            array[i] = array[i + 1];
        }
        for (i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int SearchElement (int[] arr, int X) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                System.out.println("Position of " + X + " int he array is: " + i);
                return i;
            }
        }
        return -1;
    }
}
