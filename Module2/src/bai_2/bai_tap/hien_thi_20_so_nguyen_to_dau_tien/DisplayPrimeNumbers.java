package bai_2.bai_tap.hien_thi_20_so_nguyen_to_dau_tien;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        System.out.println("First 20 prime numbers are: ");
        while (count <= 20) {
            if (isPrimeNumber(N)) {
                System.out.print(N + "\n");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
