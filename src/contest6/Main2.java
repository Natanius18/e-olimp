package contest6;
//https://www.e-olymp.com/ru/contests/18080/problems/190959

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int n, a = 0, b = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] x = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                x[i][j] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a += x[i][i];
            b += x[i][n - 1 - i];
        }
        System.out.println(a + " " + b);
    }
}