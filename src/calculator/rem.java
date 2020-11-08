package calculator;

import java.util.Scanner;

public class rem {

    double a ;
    double b ;

    public rem(){


    }

    public rem(double uper_part , double lower_part){
        this.a = uper_part;
        this.b = lower_part;
    }

    public  double reminder(){

        double reminder;

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter upper part: ");
        a = input.nextDouble();

        System.out.printf("Enter lower part: ");
        b = input.nextDouble();

        reminder = a % b ;

        System.out.printf("\nReminder is : ");

        return reminder ;
    }
}
