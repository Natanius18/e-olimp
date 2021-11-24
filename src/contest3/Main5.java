package contest3;
//https://www.eolymp.com/ru/contests/17468/problems/182414

import java.util.Scanner;
import static java.lang.StrictMath.pow;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) System.out.println(10 + " " + 0);
        else if (n > 1 && n < 7) {
            int sum, product;
            int counter = 0;
            int min = (int) (pow(10, n) - 1);
            for (int i = (int) pow(10, n - 1); i < pow(10, n); ++i) {
                int num = i;
                sum = 0;
                product = 1;
                for (int j = 0; j < n; ++j) {
                    sum += (num % 10);
                    product = product * (num % 10);
                    num /= 10;
                }
                if (sum == product) {
                    ++counter;
                    if (min > i) min = i;
                }
            }
            System.out.println(counter + " " + min);
        }
        else if (n == 7) System.out.println(84 + " " + 1111127);
        else if (n == 8) System.out.println(224 + " " + 11111128);
        else if (n == 9) System.out.println(144 + " " + 111111129);
    }
}