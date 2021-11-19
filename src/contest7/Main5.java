package contest7;
//https://www.e-olymp.com/ru/contests/18466/problems/196880
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int c = 0;
        while (scanner.hasNext()){
            str = scanner.next();
            char[] s = str.toCharArray();
            for(int i = 0; i < str.length(); i++)
                if(s[i] == '.' || s[i] == '!' || s[i] == '?'){
                c++;
                break;
            }
        }
        System.out.println(c);
    }
}


