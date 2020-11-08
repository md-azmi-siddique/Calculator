package calculator;

import java.io.IOException;

import java.text.ParseException;

import java.util.Scanner;

public class main {

    public static void main(String[] args) throws ParseException {


        Scanner input = new Scanner(System.in);

        int o = 0;
        int x = 0;

        while (x != 2){

        System.out.printf("01. Calculator\n");
        System.out.printf("02. Prime Number\n");
        System.out.printf("03. Max / Min \n");
        System.out.printf("04. Perfect\n");
        System.out.printf("05. Even / Odd\n");
        System.out.printf("06. Matrix\n");
        System.out.printf("07. Pattern\n");
        System.out.printf("08. Leap Year\n");
        System.out.printf("09. show real date\n");
        System.out.printf("10. show current age\n");
        System.out.printf("11. Conversion\n");
        System.out.printf("12. Stack\n");
        System.out.printf("13. Random Number Generate\n");
        System.out.printf("14. Celcius to farenhite\n");

        System.out.printf("Enter Option:");
        o = input.nextInt();

        switch (o) {

            case 1:

                // Runtime.getRuntime().exec("cls");
                calca cal = new calca();
                cal.calculator();

                break;

            case 2:

                primenumbr prime = new primenumbr();
                prime.prime();

                break;

            case 3:
                maxandmin select = new maxandmin();
                select.maxminresult();

                break;

            case 4:
                perfectnumber per = new perfectnumber();
                per.perf();

                break;

            case 5:
                evenodd evenorodd = new evenodd();
                evenorodd.evenandodd();

                break;

            case 6:

                matrix mat = new matrix();
                mat.matri();

                break;

            case 7:

                pattern numpat = new pattern();
                numpat.pat();
                break;

            case 8:

                leapyear lip = new leapyear();
                lip.leap();

                break;

            case 9:

                Calender count = new Calender();
                count.cal();

                break;

            case 10:

                ageCalc age = new ageCalc();
                age.agcal();

                break;

            case 11:

                base5ANDbase9 b59 = new base5ANDbase9();
                b59.b5andb9();

                break;

            case 12:

                stack sta = new stack();
                sta.sata();

            case 13:

                random ran = new random();
                ran.rano();

            case 14:

                celfa cel = new celfa();
                cel.celu();

            default:

                System.out.println("Please Enter a choice");


        }

            System.out.println();

        System.out.println("Do you want to do more operations?");
            System.out.printf("1. yes\n");
            System.out.printf("2. no\n");

        x = input.nextInt();

    }

        System.out.println("Thanks for using this service");


    }

}
