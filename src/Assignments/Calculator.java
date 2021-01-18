package Assignments;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNum;
        double secondNum;
        Character operation;
        boolean exit = false;
        System.out.println("###############################################################");
        System.out.println("                      Author:  Эмир");
        System.out.println("###############################################################");
        while(!exit){
            System.out.println("To continue the work press \"1\", any other button leads to exit.");
            if (sc.next().equals("1")){
                System.out.print("Enter first number: ");
                firstNum = sc.nextDouble();
                System.out.print("Choose the operator('+','-','*','/'): ");
                operation = sc.next().charAt(0);
                System.out.print("Enter second number: ");
                secondNum = sc.nextDouble();
                switch (operation){
                    case '+':
                        System.out.printf("Result: %.0f%n",firstNum+secondNum);
                        break;
                    case '-':
                        System.out.printf("Result: %.0f%n",firstNum-secondNum);
                        break;
                    case '*':
                        System.out.printf("Result: %.0f%n",firstNum*secondNum);
                        break;
                    case '/':
                        System.out.printf("Result: %.2f%n",firstNum/secondNum);
                        break;
                    default:
                        System.out.println("Wrong operator!");
                        break;
                }
            }else{
                exit = true;
            }
        }
        System.out.println("###########################THE END#############################");
    }
}
