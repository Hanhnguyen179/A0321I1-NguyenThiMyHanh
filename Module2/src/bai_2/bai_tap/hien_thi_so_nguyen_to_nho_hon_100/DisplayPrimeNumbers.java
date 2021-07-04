package bai_2.bai_tap.hien_thi_so_nguyen_to_nho_hon_100;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("All the prime numbers smaller than 100 are: ");
        for (int N = 2; N < 100; N++) {
            if (isPrimeNumber(N)) {
                System.out.print(N + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if(n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

