package contest7;
//https://www.e-olymp.com/ru/contests/18466/problems/196872
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int num_of_cur = 0, num_of_max = 0, size_of_max = 0, size;
        boolean t;
        while (scanner.hasNext()) {
            str = scanner.next();
            char[] s = str.toCharArray();
            num_of_cur++;
            t = true;
            if (Character.isLetterOrDigit(s[str.length() - 1])) size = str.length();
            else size = str.length() - 1;
            for (int i = 0; i < size / 2 && t; i++) {
                if (Character.toLowerCase(s[i]) != Character.toLowerCase(s[size - i - 1])) {
                    t = false;
                }
            }
            if (t && size > size_of_max) {
                num_of_max = num_of_cur;
                size_of_max = size;
            }
        }
        System.out.println(num_of_max);
    }
}

