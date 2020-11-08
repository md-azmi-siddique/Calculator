package calculator;

import java.util.Scanner;

public class base5ANDbase9 {

    public static void b5andb9(){

        Scanner scan = new Scanner(System.in);
        int o = 0;
        int  cc = 0;

        while (cc != 2) {

            System.out.printf("1. BASE 5\n");
            System.out.printf("2. BASE 9\n");

            System.out.printf("Enter Option : ");
            o = scan.nextInt();

            switch (o) {

                case 1:

                    base5 ba5 = new base5();

                    ba5.b5();

                    break;

                case 2:

                    base9 ba9 = new base9();
                    ba9.b9();

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
        System.out.println("Thanks for using Basic base convertion  \n\n");



    }
}
