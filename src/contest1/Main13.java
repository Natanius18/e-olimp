package contest1;
//https://www.eolymp.com/ru/contests/17255/problems/179216

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long res = (long) (n - 1) * m * 3;
        System.out.println(res);
    }
}