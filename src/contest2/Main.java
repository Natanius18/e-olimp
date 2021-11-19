package contest2;
//https://www.e-olymp.com/ru/contests/17392/problems/181487
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if ((x > a && (y > c || y > b)) || (x > b && (y > a || y > c)) || (x > c && (y > b || y > a)))
            System.out.println(1);
	    else System.out.println(0);
    }
}
