package calculator;

import java.util.Scanner;

public class leapyear {

    public static  void leap(){

        int year ;
        Scanner input = new Scanner(System.in);
        System.out.printf("Please Enter year:\n");
        year = input.nextInt();
        boolean leap = true;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + "is leap year");
        else
            System.out.println(year + "is :NOT leap year");


    }
}
