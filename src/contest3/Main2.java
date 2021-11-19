package contest3;
//https://www.e-olymp.com/ru/contests/17468/problems/182446
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while (i>0) {
            if (i%2==1)	c+=1;
            i /= 2;
        }
        System.out.println(c);
    }
}