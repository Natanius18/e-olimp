package contest2;
//https://www.eolymp.com/ru/contests/17392/problems/181489

import java.util.Scanner;
public class Main4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hundr = n / 100;
        int twent = (n - hundr * 100) / 20;
        int one = n - twent * 20 - hundr * 100;
        int a = (hundr * 100 + twent * 30 + one * 2);
        int b = (hundr * 100 + (twent + 1) * 30);
        int c = (hundr + 1) * 100;
        System.out.println(Math.min(a, Math.min(b, c)));
    }
}