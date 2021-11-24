package contest3;
//https://www.eolymp.com/ru/contests/17468/problems/182413

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 1;
        while (number / 10 > 0) {
            number /= 10;
            counter++;
        }
        System.out.println(counter);
    }
}