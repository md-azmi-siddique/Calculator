package calculator;

import java.util.Scanner;

public class matrix {

    public static void matri(){

        Scanner scan = new Scanner(System.in);
        int o = 0;
        int x = 0;


        while (x != 2) {

            System.out.printf("1. 3*3 foroward diagonal sum\n");
            System.out.printf("2. 3*3 reverse diagonal sum\n");
            System.out.printf("3. Check the number grater of less then 0\n");

            System.out.printf("Enter Option : ");
            o = scan.nextInt();

            switch (o) {

                case 1:
                    fdio_sum fdio = new fdio_sum();
                    fdio.fdiosum();
                    break;

                case 2:

                    rdio_sum rdio = new rdio_sum();
                    rdio.reverdio();
                    break;
                case 3:

                    check0and1 ch = new check0and1();
                    ch.check();

                default:
                    System.out.println("Please enter a choice");

            }

            System.out.println("Do you want to do more operations?");
            System.out.printf("1. yes\n");
            System.out.printf("2. no\n");
            x = scan.nextInt();
        }

        System.out.println();
        System.out.println("Thanks for using matrix menu \n\n");
    }
}

