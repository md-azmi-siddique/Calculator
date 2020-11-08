package calculator;

import java.util.Scanner;

public class add {

    int n;
    double [] arr = new double[n];
    double sum = 0.00;

    public add(){

    }

    public add(double array[]){

        this.arr = array ;

    }

    public double sum (){

        Scanner input = new Scanner(System.in);

        double add = 0.00;
        int n ;

        System.out.printf("How many numbers do you want : ");
        n = input.nextInt();

        double [] a = new double[n];


        for(int i =0 ; i < n ; i++ ) {

            a[i] = input.nextDouble();

        }

        for(int i =0 ; i < n ; i++ ){

            add = add + a[i];

        }
        System.out.printf("Summation is :");

        return add ;

    }
}
