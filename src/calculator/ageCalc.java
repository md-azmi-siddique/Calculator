package calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import  java.util.Date;

public class ageCalc {

    public static void agcal() throws ParseException {

        Scanner input =new Scanner(System.in);

        System.out.printf("Enter birth Date:\n");
        System.out.println("DD-MM-YYYY");

        String dob = input.next();

        SimpleDateFormat sdfi = new SimpleDateFormat("dd-mm-yyyy");

        Date udob = sdfi.parse(dob);

        Date sysdate = new Date();

        long ms = System.currentTimeMillis() - udob.getTime();

        long age = (long) ((long)ms/(1000.0*60*60*24*365));

        System.out.println("Your current age is :"+age);

    }
}
