import java.util.Scanner;



public class Task50_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1222830961; //249001303; // scanner.nextInt();
        System.out.println(x);
        // Начала отсчета
        long start = System.currentTimeMillis();
        int del = 2;
        int itr = 0;

        boolean odd = true;

        int sq = 1 + (int) Math.sqrt(x);

        if (x % del == 0 ) {
            System.out.println(del);
            while (x % del == 0 ) {
                x /= del;
                itr++;
            }
        }
        del = 3;
        if (x % del == 0 ) {
            System.out.println(del);
            while (x % del == 0 ) {
                x /= del;
                itr++;
            }
        }
        del = 5;

        while (del <= sq && del <= x) {
            itr++;
            if (x % del == 0 ) {
                System.out.println(del);
                while (x % del == 0 ) {
                    x /= del;
                    itr++;
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

        // Получение и запись в переменную timeWorkCode времени работы программы
        long timeWorkCode = System.currentTimeMillis() - start;
        // Вывод времени выполнения работы кода на экран
        System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд. " + itr +  " - операций");
    }
}