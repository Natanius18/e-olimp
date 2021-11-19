package contest2;
//https://www.e-olymp.com/ru/contests/17392/problems/181498
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        if (x <= 3) { System.out.println("Initial");}
        else if (x <= 6) {System.out.println("Average");}
        else if (x <= 9) {System.out.println("Sufficient");}
        else System.out.println("High");
    }
}