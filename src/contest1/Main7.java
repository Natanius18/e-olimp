package contest1;
//https://www.eolymp.com/ru/contests/17255/problems/179194

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long first = a/10;
        long sec = a%10;
        System.out.println((first+sec)*(first+sec));
    }
}