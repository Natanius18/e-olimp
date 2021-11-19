package contest7;
//https://www.e-olymp.com/ru/contests/18466/problems/196871

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] b = str.toCharArray();
        int a = str.length();
        int c = 1;
        for (int i = 1; i < a; i++) {
            if (b[i - 1] == ' ' && b[ i]=='-' && b[ i + 1]==' ') c--;
            if (b[i] == ' ' || b[i] == ',') {
                c = c + 1;
                for (int j = i - 1; j < a; j++) {
                    int u = 1;
                    if (b[i + u] == ' ' || b[i + u] == ',') {
                        i = i + u;
                    } else {
                        break;
                    }
                }
            }
        }
        if (b[a - 1] == ' ') c--;
        if (b[0] == ' ') c--;
        System.out.println(c);
    }
}