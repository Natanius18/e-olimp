package contest2;
//https://www.eolymp.com/ru/contests/17392/problems/181481

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long d = scanner.nextLong();
        long l = n * m + k * m + k * n;
        if (-1 * (d * k * n * m) % (l - k * n * m) != 0 || k * m * n <= l) {
            System.out.println(-1);;
        } else System.out.println(-1 * (d * k * n * m) / (l - k * n * m));
    }
}