package contest5;
//https://www.e-olymp.com/ru/contests/17696/problems/185609                 ?????????????????????????????
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        boolean[] b = new boolean[10];
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            if ((int)str.charAt(i) >= 48) {
                b[(int)str.charAt(i) - '0'] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (!b[i]) count++;
        }
        System.out.println(count);
        for(int i=0; i < 10; ++i)
            if(!b[i]) System.out.print(i + " ");
    }
}