package contest5;
//https://www.eolymp.com/ru/contests/17696/problems/185611

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        double sum = 0;
        int[] x = new int[n];
        double s = Math.PI * r * r;
        for (int i = 0; i < n; ++i) {
            int a = scanner.nextInt();
            x[i] = a;
            sum += a;
        }
        DecimalFormat df = new DecimalFormat("#.#########");
        for (int i = 0; i < n; ++i) {
            double v = s * (x[i] / sum);
            System.out.println(df.format(v));
        }
    }
}