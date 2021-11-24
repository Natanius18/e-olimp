package contest6;
//https://www.eolymp.com/ru/contests/18080/problems/190942
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        String[] s1 = new String[h];
        String[] s2 = new String[h];
        for (int i = 0; i < h; ++i) {
            s1[i] = scanner.next();
        }for (int i = 0; i < h; ++i) {
            s2[i] = scanner.next();
        }
        String str = scanner.next();
        for (int i = 0; i < s1.length; ++i) {
            for (int j = 0; j < w; ++j) {
                if (s1[i].charAt(j) == 48 && s2[i].charAt(j) == 48) {
                    System.out.print(str.charAt(0));
                } else if (s1[i].charAt(j) == 48 && s2[i].charAt(j) == 49) {
                    System.out.print(str.charAt(1));
                } else if (s1[i].charAt(j) == 49 && s2[i].charAt(j) == 48) {
                    System.out.print(str.charAt(2));
                } else {
                    System.out.print(str.charAt(3));
                }
            }
            System.out.println();
        }
    }
}