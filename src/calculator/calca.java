package calculator;

import java.util.Scanner;

public class calca {

    public static void calculator(){

        Scanner scan = new Scanner(System.in);
        int o = 0;

        int  cc = 0;

        while (cc != 2) {

            System.out.printf("1. Sum\n");
            System.out.printf("2. Sub\n");
            System.out.printf("3. Multi\n");
            System.out.printf("4. Div\n");
            System.out.printf("5. Rem\n");
            //System.out.printf("6. Quit\n");


            System.out.printf("Enter Option : ");
            o = scan.nextInt();

            switch (o) {

                case 1:
                    add sum = new add();
                    System.out.println(sum.sum());
                    break;

                case 2:
                    sub sub = new sub();
                    System.out.println(sub.subs());

                    break;

                case 3:
                    mult multi = new mult();
                    System.out.println(multi.multiplication());

                    break;

                case 4:
                    div divide = new div();
                    System.out.println(divide.divisivle());

                    break;


                case 5:
                    rem reminder = new rem();
                    System.out.println(reminder.reminder());

                    break;

                default:
                    System.out.println("Please enter a choice");
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
