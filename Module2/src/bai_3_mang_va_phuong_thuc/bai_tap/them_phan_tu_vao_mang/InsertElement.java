package bai_3_mang_va_phuong_thuc.bai_tap.them_phan_tu_vao_mang;
import java.util.Scanner;
public class InsertElement {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int i;
        /*while (i < N) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }*/
        System.out.println("Enter the number you want to insert: ");
        int x = scanner.nextInt();
        System.out.println("Enter the index you want to insert x: ");
        int index = scanner.nextInt();
        if(index <= 1 || index >= array.length-1)
            System.out.println("It is impossible to insert x at this index: ");
        for (i=index; i<array.length; i++) {
            if (i == index)
                array[i] = x;
           /* else
                array[i] = array[i+1];*/
        }
        for (i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
