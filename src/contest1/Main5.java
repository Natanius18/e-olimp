package contest1;
//https://www.eolymp.com/ru/contests/17255/problems/179190

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = a/100;
        int b = c%10;
        int d = a/10;
        int t = d%10;
        int f = a%10;
        System.out.println(b*t*f);
    }
}