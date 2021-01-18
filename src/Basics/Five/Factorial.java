package Basics.Five;

public class Factorial {
    public static void main(String[] args) {
        int n = 20;
        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        //Problem occurs when variable factorial was multiplied by 17,
        //it turned to negative,
        //because max size of int(2,147,483,647) was exceeded.
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
