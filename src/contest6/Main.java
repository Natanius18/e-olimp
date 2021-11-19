package contest6;
//https://www.e-olymp.com/ru/contests/18080/problems/190950

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m, i, j;
        long[][] a = new long[50][50];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                a[i][j] = scanner.nextLong();
        }
        System.out.println(m + " " + n);
        for (i = 0; i < m; i++) {
            for (j = n - 1; j >= 0; j--)
                if (j > 0) System.out.println(a[j][i] + " ");
                else System.out.println(a[j][i]);
        }
    }
}