package contest7;
//https://www.e-olymp.com/ru/contests/18466/problems/196870
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        if (s1.length() > s2.length()) System.out.print(">");
        else if (s1.length() < s2.length()) System.out.print("<");
        else {
            int i = 0;
            for (; i < s1.length(); i++){
                if (s1.charAt(i) > s2.charAt(i)){
                    System.out.print(">");
                    break;
                }
                else if (s1.charAt(i) < s2.charAt(i)) {
                    System.out.print("<");
                    break;
                }
            }
            if (i == s1.length()) System.out.print("=");
        }
    }
}