package Basics.Six;

public class CaesarCypher {

    public static final int alphabetSize = 26;
    public static final int shift = 3;

    public static String caesarEncrypt(String word){
        StringBuilder stringBuilder = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar)){
                int alphabetStart =
                        Character.isUpperCase(currentChar)? 65: 97;
                int numOfChar = word.charAt(i)-alphabetStart;
                if (numOfChar >= 0 && numOfChar < alphabetSize-shift){
                    numOfChar += shift;
                }else{
                    numOfChar -= (alphabetSize-shift);
                }
                numOfChar += alphabetStart;
                stringBuilder.append((char)numOfChar);
            }else{
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    public static String caesarDecrypt(String word){
        StringBuilder stringBuilder = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar)){
                int alphabetStart =
                        Character.isUpperCase(currentChar)? 65: 97;
                int numOfChar = word.charAt(i)-alphabetStart;
                if (numOfChar >= shift && numOfChar < alphabetSize){
                    numOfChar -= shift;
                }else{
                    numOfChar += (alphabetSize-shift);
                }
                numOfChar += alphabetStart;
                stringBuilder.append((char)numOfChar);
            }else{
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = caesarEncrypt("D!K#@!#!ADzxcc");
        System.out.println(caesarDecrypt(str));
    }
}
