package contest4;
//https://www.e-olymp.com/ru/contests/17606/problems/184379

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, k;
        String a, b, c, i;
        t = scanner.nextInt();
        while (t != 0) {
            a = "G";
            b = "C";
            c = "V";
            k = scanner.nextInt();
            while (k != 0) {
                i = b;
                b = c;
                c = i;

                i = a;
                a = b;
                b = i;

                k--;
            }
            System.out.println(a + b + c);
            t--;
        }
    }
}