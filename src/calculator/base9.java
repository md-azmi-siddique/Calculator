package calculator;

import java.util.Scanner;

import static calculator.base9to10.base9toBase10;
import static calculator.base9to16.base9toBase16;
import static calculator.base9to2.base9toBase2;
import static calculator.base9to8.base9toBase8;

public class base9 {

    public  static void b9(){

        int bnine,dnine,onine;
        String hnine;

        Scanner sc = new Scanner(System.in);

        System.out.println("Let me calculate!!! It's a 'piece of cake'!!!");
        int input=sc.nextInt();
        System.out.println("Please input your desired integer(in Base9):");
        dnine=base9toBase10(input);
        bnine=base9toBase2(dnine);
        hnine=base9toBase16(dnine);
        onine=base9toBase8(dnine);

        System.out.println("2. "+input+" is in base 10:"+"  "+dnine);
        System.out.println("1. "+input+" is in base 2 :"+"  "+bnine);
        System.out.println("3. "+input+" is in base 8 :"+"  "+onine);
        System.out.println("4. "+input+" is in base 16:"+"  "+hnine);

    }
}
