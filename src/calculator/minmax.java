package calculator;

import java.util.Scanner;

public class minmax {

    public minmax(){

    }

    public static void minormax(){

        Scanner input = new Scanner(System.in);

        int n;

        System.out.printf("How many numbers do you want : ");
        n = input.nextInt();
        double [] min = new double[n];

        for(int i =0 ; i < n ; i++ ) {

            min[i] = input.nextDouble();

        }

        double mina = min[0];

        for(int i = 1 ; i <n ; i++){

            if(mina > min[i]){

                mina = min[i];

            }

        }
        System.out.println("Minimum value is "+mina);

    }
}
