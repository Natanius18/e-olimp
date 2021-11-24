package contest6;
//https://www.eolymp.com/ru/contests/18080/problems/190947

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] x = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j < n - i - 1)
                    x[i][j] = 2;
                else if (j == n - i - 1)
                    x[i][j] = 0;
                else
                    x[i][j] = 1;
                System.out.print(x[i][j]);
            }
            System.out.println();
        }

    }
}