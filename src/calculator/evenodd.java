package calculator;

import java.util.Scanner;

public class evenodd {

    public evenodd(){

    }

    public static void evenandodd(){

        int n;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a positive number:");
        n = input.nextInt();

        if(n % 2 == 0){
            System.out.println(n+" "+"is even number");
        }
        else{
            System.out.println(n+" "+"is odd number");
        }



        //return evenandodd();
    }
}
