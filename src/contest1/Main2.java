package contest1;
//https://www.eolymp.com/ru/contests/17255/problems/179179
import java.util.Scanner;
import static java.lang.Math.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long y = scanner.nextInt();
        long x;
        double a, b;
        a = floor(sqrt(y));
        b = ceil(y/a);
        x = (long)(2*y + a + b);
        System.out.println(x);
    }
}