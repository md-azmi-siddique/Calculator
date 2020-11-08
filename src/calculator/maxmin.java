package calculator;

import java.util.Scanner;

public class maxmin {


    public static void maxormin(){

        Scanner input = new Scanner(System.in);

        int n;
        //double maxe;
        System.out.printf("How many numbers do you want : ");
        n = input.nextInt();
        double [] max = new double[n];

        for(int i =0 ; i < n ; i++ ) {

            max[i] = input.nextDouble();

        }

        double maxa = max[0];

        for(int i = 1 ; i <n ; i++){

            if(maxa < max[i]){

                maxa = max[i];

            }

        }
        System.out.println("Maximum value is "+maxa);

    }
}
