package Basics.Six;


public class CountVowelsDigits {

    public static void countVowelsDigits(String string){
        float length = string.length();
        string = string.toUpperCase();

        int vowels = 0;
        int digits = 0;
        for (int i = 0; i < length; i++){
            char currChar = string.charAt(i);
            if (currChar >= '0' && currChar <= '9') digits++;
            else if (currChar == 'A' || currChar == 'E' ||
                    currChar == 'I' || currChar == 'O' || currChar == 'U') vowels++;
        }
        System.out.printf("Number of vowels: %d (%.2f%%)%n",vowels,vowels/(length/100));
        System.out.printf("Number of vowels: %d (%.2f%%)%n",digits,digits/(length/100.0));
    }

    public static void main(String[] args) {
        countVowelsDigits("testing12345");
//        countVowelsDigits("test123tset");
    }
}
