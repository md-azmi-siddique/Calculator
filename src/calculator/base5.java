package calculator;

import java.util.Scanner;

import static calculator.base5to10.base5toBase10;
import static calculator.base5to16.base5toBase16;
import static calculator.base5to2.base5toBase2;
import static calculator.base5to8.base5toBase8;

public class base5 {

    public static void b5(){

        int bfive,dfive,ofive;
        String hfive;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your desired integer(in Base5):");
        int input=sc.nextInt();

        System.out.println("Let me calculate!!! It's a 'piece of cake'!!!");
        dfive = base5toBase10(input);
        bfive =base5toBase2(dfive);
        hfive =base5toBase16(dfive);
        ofive =base5toBase8(dfive);

        System.out.println("2. "+input+" is in base 10:"+"  "+dfive);
        System.out.println("1. "+input+" is in base 2 :"+"  "+bfive);
        System.out.println("3. "+input+" is in base 8 :"+"  "+ofive);
        System.out.println("4. "+input+" is in base 16:"+"  "+hfive);
    }
}
