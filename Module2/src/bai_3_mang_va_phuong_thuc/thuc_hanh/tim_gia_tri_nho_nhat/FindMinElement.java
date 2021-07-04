package bai_3_mang_va_phuong_thuc.thuc_hanh.tim_gia_tri_nho_nhat;

public class FindMinElement {
    public static int minValue(int[] array) {
        int i;
        int min = array[0];
        int pos = 0;
        for (i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
