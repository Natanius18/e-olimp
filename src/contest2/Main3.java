package contest2;
//https://www.e-olymp.com/ru/contests/17392/problems/181502
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if ((a*a+b*b==c*c) || (a*a+c*c==b*b) || (c*c+b*b==a*a)) {
            System.out.println("YES");
        }
	    else System.out.println("NO");
    }
}
