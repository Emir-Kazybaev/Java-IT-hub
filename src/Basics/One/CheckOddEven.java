package Basics.One;
//1.2

import java.util.Scanner;

public class CheckOddEven {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scanner.nextInt();

        System.out.println("The number is " + number);

        if (number % 2 == 0) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }
}
