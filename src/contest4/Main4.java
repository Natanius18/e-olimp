package contest4;
//https://www.e-olymp.com/ru/contests/17606/problems/184383
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        long sum = 0;
        int a;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            a = scanner.nextInt();
            sum += a;
        }
        System.out.print(sum);
    }
}