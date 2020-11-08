package calculator;

import java.util.Scanner;

public class mult {

    int n;
    double[] arr = new double[n];
    double mult = 1.00;

    public mult(){

    };

    public mult(double array[]){

        this.arr = array ;

    }



    public double multiplication(){

        Scanner input = new Scanner(System.in);

        double multi = 1.00;
        int n ;

        System.out.printf("How many numbers do you want : ");
        n = input.nextInt();

        double [] b = new double[n];


        for(int i =0 ; i < n ; i++ )
        {

            b[i] = input.nextDouble();

        }

        for(int i =0 ; i < n ; i++ ){

            multi = multi*b[i];

        }
        System.out.printf("Numbers are ");

        return multi;
    }

}
