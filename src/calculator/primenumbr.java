package calculator;

import java.util.Scanner;

public class primenumbr {

    public primenumbr(){

    }

    public static  void prime(){

        int i ;
        int num ;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a positive integer :");
        num = input.nextInt();

        for (i = 2 ; i < num ; i++){

            if(num % i == 0){

                count++;

                break;

            }
        }

        if(count == 0){

            System.out.println("\nThis is a Prime Number");

        }
        else{

            System.out.println("\nThis is not a Prime Number");

        }

    }
}
