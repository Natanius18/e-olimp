package contest4;
//https://www.e-olymp.com/ru/contests/17606/problems/184382
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int n, a, b;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n-- > 0){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}