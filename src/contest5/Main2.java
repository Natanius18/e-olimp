package contest5;
//https://www.e-olymp.com/ru/contests/17696/problems/185613
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt() + 1;
        int[] f = new int[47];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= 46; i++){
            f[i] = f[i-1] + f[i-2];
        }
        System.out.println(f[n]);
    }
}