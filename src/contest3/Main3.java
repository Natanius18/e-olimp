package contest3;
//https://www.e-olymp.com/ru/contests/17468/problems/182448
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int n, a;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n-- > 0){
            a = scanner.nextInt();
            System.out.print((a>=0 ? a+2 : a) + " ");;
        }
    }
}