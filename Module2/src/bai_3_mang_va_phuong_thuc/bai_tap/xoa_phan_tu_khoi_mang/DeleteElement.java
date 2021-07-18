package bai_3_mang_va_phuong_thuc.bai_tap.xoa_phan_tu_khoi_mang;
import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter the element you want to delete: ");
        int x = scanner.nextInt();
        int index_del = searchElement(array,x);
        if (index_del == -1) {
            System.out.println("Not found the element");
        }
        for (i = index_del; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length-1] = 0;
        for (i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int searchElement (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Position of " + x + " int he array is: " + i);
                return i;
            }
        }
        return -1;
    }
}
