package contest4;
//https://www.e-olymp.com/ru/contests/17606/problems/184376

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, a, b, i;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        i = a;
        for (int j = 0; j < n - 1; j++) {
            b = scanner.nextInt();
            while (i > 0 && (b % i != 0 || a % i != 0)) {
                i--;
            }
            a = i;

        }
        System.out.println(i);
    }
}