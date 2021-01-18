package Basics.One;
//1.1

import java.util.Scanner;

public class CheckPassFail {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int mark = scanner.nextInt();

        System.out.println("The mark is " + mark);

//        System.out.println(mark >= 50? "PASS": "FAIL");
        if (mark >= 50){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        System.out.println("Done");
    }
}
