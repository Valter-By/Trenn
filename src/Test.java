
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int del = 2;
        int n = x / 2 + 1;
        if (prost(x)) {
            System.out.println(x);
        } else {
            while (del <= x && del <= n) {
                if (x % del == 0) {
                        System.out.println(del);
                        while (x % del == 0) {
                            x /= del;
                        }
                }
                del = nextProst(del);
            }
        }
    }

    private static boolean prost(int n) {

        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n / 2 + 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private static int nextProst(int n) {
        if (n == 2) {
            return 3;
        } else if (n == 3) {
            return 5;
        } else
        do {
            n += 2;
            int m = n / 3 + 1;
            int i = 3;
            int sum = 0;
            while (i <= m ) {
                if (n % i == 0) {
                    sum++;
                }
                i += 2;
            }
            if (sum == 0) {
                return n;
            }
        } while (n > 1);
            return -1;

    }
}
