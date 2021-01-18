package Basics.Six;

import java.util.Scanner;

public class ExchangeCypher {

    //A 65,Z 90
    public static void exchangeCypher(String cypher){
        String upper = cypher.toUpperCase();
        for (int i = 0; i < cypher.length(); i++){
            char currChar = upper.charAt(i);
            currChar = (char)(155 - currChar);
            System.out.print(currChar);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exchangeCypher(scanner.next());
//        exchangeCypher("abcXYZ");
//        exchangeCypher("jklmnopq");
    }
}
