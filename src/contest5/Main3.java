package contest5;
//https://www.e-olymp.com/ru/contests/17696/problems/185609

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main3 {
    public static void main (String[] args) throws Exception{
        int a;
        int count = 0;
        boolean[] n = new boolean[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((a = br.read()) != -1) {
            if (a >= 48 && a <= 57) n[a - 48] = true;
        }
        for (int i = 0; i < 10; i++) {
            if (!n[i]) count++;
        }
        System.out.println(count);
        for (int i = 0; i < 10; i++) {
            if (!n[i]) System.out.print(i + " ");
        }
    }
}