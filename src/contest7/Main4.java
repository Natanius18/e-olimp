package contest7;
//https://www.e-olymp.com/ru/contests/18466/problems/196876
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] b = str.toCharArray();
        int a = str.length();
        int c = 0;
        for (int i = 0; i < a; i++) {
            if ((b[i] == 'A' || b[i] == 'E') || (b[i] == 'I' || b[i] == 'O')
                    || (b[i] == 'U' || b[i] == 'Y')) c++;
        }
        System.out.println(c);
    }
}