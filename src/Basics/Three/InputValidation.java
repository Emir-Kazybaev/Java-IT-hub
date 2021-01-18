package Basics.Three;

import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isValid = false;
        System.out.println("Enter the number between 0 and 10 or 90 and 100");
        do {
            number = scanner.nextInt();
            if ((number >= 0 && number <=10) || (number >= 90 && number <=100) ){
                isValid = true;
            }else{
                System.out.println("Enter the number between 0 and 10 or 90 and 100");
            }

        }while (!isValid);
        System.out.printf("Your number: %d%n",number);

    }
}
