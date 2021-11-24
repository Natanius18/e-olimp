package contest5;
//https://www.eolymp.com/ru/contests/17696/problems/185615

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCol = 0;
        String p = scanner.nextLine().replaceAll(" ", "");
        int[] v = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i < p.length(); i++) {
            v[p.charAt(i) - 48]++;
        }
        for (int i = 0; i < 10; ++i) {
            maxCol += v[i] / 2;
        }
        System.out.println(maxCol);
    }
}