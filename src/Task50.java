import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int del = 2;

        boolean odd = true;

        int sq = 1 + (int) Math.sqrt(x);

        if (x % del == 0 ) {
            System.out.println(del);
            while (x % del == 0 ) {
                x /= del;
            }
        }
        del = 3;
        if (x % del == 0 ) {
            System.out.println(del);
            while (x % del == 0 ) {
                x /= del;
            }
        }
        del = 5;

        while (del <= sq && del <= x) {
            if (x % del == 0 ) {
                System.out.println(del);
                while (x % del == 0 ) {
                    x /= del;
                }
            }
            if (odd) {
                del += 2;
                odd = false;
            } else {
                del += 4;
                odd = true;
            }
        }
        if (x > 1) {
            System.out.println(x);
        }

    }
}