package Basics.Three;

import java.util.Scanner;

public class AWInputValidation {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_STUDENTS = 3;
        int number;
        double sum = 0;
        for(int i = 1 ; i <= NUM_STUDENTS; i++){
            boolean isValid = false;
            do {
                System.out.printf("Enter the mark(0-100) for the student %d: ",i);
                number = scanner.nextInt();
                if ((number >= 0 && number <=100) ){
                    isValid = true;
                    sum+=number;
                }else{
                    System.out.println("Wrong input! Try again ...");
                }
            }while (!isValid);
        }
        System.out.printf("Average grade : %.2f%n",sum/NUM_STUDENTS);
    }
}
