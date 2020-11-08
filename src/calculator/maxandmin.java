package calculator;

import java.util.Scanner;

public class maxandmin {

    public maxandmin() {

    }

        public static void maxminresult () {

        Scanner scan = new Scanner(System.in);
        int o = 0;
        int  cc = 0;

        while (cc != 2) {

        System.out.printf("1. Max\n");
        System.out.printf("2. min\n");

        System.out.printf("Enter Option : ");
        o = scan.nextInt();

        switch (o) {

            case 1:

                maxmin max = new maxmin();

                max.maxormin();

                break;

            case 2:

                minmax min = new minmax();

                min.minormax();

                break;

            default:

                System.out.println("Please enter a valid choice");

                break;
        }

            System.out.println("Do you want to do more calculations?");
            System.out.printf("1. yes\n");
            System.out.printf("2. no\n");

            cc = scan.nextInt();

        }

         System.out.println();
        System.out.println("Thanks for using Basic Calculator \n\n");
    }

}