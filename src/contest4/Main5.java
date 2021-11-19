package contest4;
//https://www.e-olymp.com/ru/contests/17606/problems/184390
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        double n, a, sum = 0, amm = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextDouble();
        while (n != 0){
            a = scanner.nextDouble();
            if (a > 0){
                sum += a;
                amm++;
            }
            n--;
        }
        System.out.println((amm > 0 ? String.format("%8.2f", sum/amm).replace(',', '.') : "Not Found"));

    }
}