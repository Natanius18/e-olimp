package contest1;
//https://www.eolymp.com/ru/contests/17255/problems/179182
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long first = a+b-1;
        long remain = a*b-first;
        long res = remain + 1;
        System.out.println(res);
    }
}