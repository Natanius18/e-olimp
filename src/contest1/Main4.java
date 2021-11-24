package contest1;
//https://www.eolymp.com/ru/contests/17255/problems/179188

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y = scanner.nextInt();
        long z = x * x + y * y;
        System.out.println(z);
    }
}