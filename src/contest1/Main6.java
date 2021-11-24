package contest1;
//https://www.eolymp.com/ru/contests/17255/problems/179193

import java.util.Scanner;
import static java.lang.Math.abs;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        a = abs(a);
        long first = a/100;
        long sec = a/10%10;
        long thr = a%10;
        System.out.println(first);
        System.out.println(sec);
        System.out.println(thr);
    }
}