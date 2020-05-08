package lesson1;

public class Task2 {

    public static void main(String[] args) {

    }

    public void downRow(int[][] ar) {
        int n = ar.length;
        int m = ar[0].length;
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i] += ar[i][j];

            }
        }


    }




}
