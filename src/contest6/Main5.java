package contest6;
//https://www.eolymp.com/ru/contests/18080/problems/190943

import java.util.Scanner;
import java.util.Vector;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        Vector<String> v = new Vector<>();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; ++i) {
            int isX = 0;
            for (int j = 0; j < n; ++j) {
                if (a[j][i] == x) ++isX;
            }
            if (isX > 0) v.add("YES");
            else v.add("NO");
        }
        for (String e : v) System.out.println(e);
    }
}


