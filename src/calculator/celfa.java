package calculator;

import java.util.Scanner;

public class celfa {

    public static void celu(){

        double c,f;

        Scanner input = new Scanner (System.in);

        System.out.println("give me any number: ");
        c=input.nextDouble();

        f=((double)9/5)*c + 32;
        System.out.println("Temperature converted from celcious to fahrenheit: " +f);
    }
}
