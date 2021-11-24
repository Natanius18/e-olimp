package contest5;
//https://www.eolymp.com/ru/contests/17696/problems/185606

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int i1 = scanner.nextInt();
            int j1 = scanner.nextInt();
            int c = 1, max_cnt = 1, i, j;
            if (i1 > j1) {
                i = j1;
                j = i1;
            }
            else {
                i = i1;
                j = j1;
            }
            for (int num = i; num <= j; num++) {
                int tmp = num;
                while (tmp > 1) {
                    if (tmp % 2 == 1) {
                        tmp = 3 * tmp + 1;
                    }
                    else {
                        tmp /= 2;
                    }
                    c++;
                }
                int cnt = c;
                if (max_cnt < cnt) max_cnt = cnt;
                c = 1;
            }
            System.out.println(i1 + " " + j1 + " " + max_cnt);
        }
    }
}