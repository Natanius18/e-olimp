package contest5;
//https://www.e-olymp.com/ru/contests/17696/problems/185608

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m, a;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            m = scanner.nextInt();
            x[i] = m;
        }
        a = x[n - 1];
        System.arraycopy(x, 0, x, 1, n - 1);
        x[0] = a;
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
    }
}