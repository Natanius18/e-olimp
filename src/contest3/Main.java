package contest3;
//https://www.e-olymp.com/ru/contests/17468/problems/182416
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m, n, k;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        k = scanner.nextInt();
        System.out.print(m/n + ".");
        for (int j = 0; j < k; j++) {
            m = ((m%n)*10);
            System.out.print(m/n);
        }
    }
}