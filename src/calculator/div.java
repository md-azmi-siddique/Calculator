package calculator;

import java.util.Scanner;

public class div {

    double a ;
    double b ;

    public div(){


    }

    public div(double uper_part , double lower_part){
        this.a = uper_part;
        this.b = lower_part;
    }

    public double divisivle(){

        double divide;

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter upper part: ");
        a = input.nextDouble();

        System.out.printf("Enter lower part: ");
        b = input.nextDouble();

        divide = a / b ;

        System.out.printf("Divition is :");

        return divide ;
    }
}
