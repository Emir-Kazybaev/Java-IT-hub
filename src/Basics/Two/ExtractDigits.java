package Basics.Two;

public class ExtractDigits {

    public static String extractDigits(int number){
        StringBuilder digitsString = new StringBuilder();
        while (number != 0){
            digitsString.append(number % 10 + " ");
            number=number/10;
        }
        return digitsString.toString();
    }

    public static void main(String[] args) {
        System.out.println(extractDigits(15423));
    }
}
