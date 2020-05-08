package lesson1;

public class Task2 {

    public static void main(String[] args) {

        int[][] a = new int[][] {
                { 1, 2, 3, 3 },
                { 4, 5, 6, 2 },
                { 7, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 100, 1 }};

        downRows(a);

        int n = a.length;
        int m = a[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static void downRows(int[][] ar) {
        int n = ar.length;
        int m = ar[0].length;
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i] += ar[i][j];
            }
        }
        int t;
        int[] p;

        for (int i = 0; i < n ; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                if (sum[k] < sum[k + 1] ) {
                    t = sum[k];
                    p = ar[k];
                    sum[k] = sum[k + 1];
                    ar[k] = ar[k + 1];
                    sum[k + 1] = t;
                    ar[k + 1] = p;
                }
            }
        }
    }




}
