package calculator;

import java.util.Scanner;

public class perfectnumber {


    public static void perf(){

        int sum = 0;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number:");
        n= input.nextInt();

        if(n > 0){

            for(int i =1 ; i <= n/2 ; i++){

                if(n % i == 0){
                    sum = sum + i;
                }
            }

            if(sum == n){
                System.out.println(n+" "+"is a perfect number");
            }

            else{
                System.out.println(n+" "+"is not a perfect number");
            }
        }
        else{
            System.out.println("Enter a positive number: ");
        }

        //return perf();
    }
}
