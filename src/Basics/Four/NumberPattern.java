package Basics.Four;

public class NumberPattern {

    public static void A(int number){
        System.out.println("A pattern");
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void B(int number){
        System.out.println("B pattern");
        for (int i = number; i > 0; i--){
            for (int spaces = number - i; spaces > 0; spaces--){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void C(int number){
        System.out.println("C pattern");
        for (int i = 1; i <= number; i++){
            for (int spaces = number - i; spaces > 0; spaces--){
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void D(int number){
        System.out.println("D pattern");
        for (int i = number; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPatterns(int number){
        A(number);
        B(number);
        C(number);
        D(number);
    }

    public static void main(String[] args) {
        printPatterns(8);
    }
}
