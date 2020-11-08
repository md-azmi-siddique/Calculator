package calculator;

import java.util.Scanner;

public class sub {

    public double subs (){

        Scanner input = new Scanner(System.in);

        double sub = 0.00;
        int i,n ;

        System.out.println("How many inputs?");
        n = input.nextInt();

        System.out.println("Input numbers");

        double [] a = new double[n];

        for(i = 0 ; i < n ; i++ ) {

            a[i] = input.nextDouble();

        }

        for(i =0 ; i < n ; i++ ){

            sub = a[i] - sub;

        }
        System.out.printf("Subtraction result= ");

        return sub ;
    }
}
