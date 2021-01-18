package Basics.Six;

public class ReverseString {

    public static void revString(String str){
        int length = str.length();
//        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        for (int i = length - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
//        return stringBuilder;
    }

    public static void main(String[] args) {
        revString("Hello");
        revString("qwerty");
    }
}
