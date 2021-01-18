package Basics.Two;

public class Fibo {

    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        double sum = fnMinus1 + fnMinus2;
        System.out.printf("First %d Fibonacci numbers:%n%d %d ",nMax,fnMinus1,fnMinus2);


        while (n <= nMax){
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum+=fn;
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        System.out.printf("%nAverage is %.1f",sum/nMax);
    }
}
