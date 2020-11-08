package calculator;

import java.util.Scanner;

public class pattern {

    public static void pat(){


        Scanner scan = new Scanner(System.in);
        int o = 0;

        int  cc = 0;

        while (cc != 2) {

            System.out.printf("1. Number Pattern\n");
            System.out.printf("2. Plus Star Pattern\n");
            //System.out.printf("3. Multi\n");
            //System.out.printf("4. Div\n");
            //System.out.printf("5. Rem\n");
            //System.out.printf("6. Quit\n");


            System.out.printf("Enter Option : ");
            o = scan.nextInt();

            switch (o){

                case 1:

                    numberPattern pat = new numberPattern();
                    pat.numpa();

                    break;

                case 2:

                    starPlusPattern sppp = new starPlusPattern();
                    sppp.spp();

                    break;
            }

            System.out.println("Do you want to do more calculations? if yes, press any key. If no, press 2");
            cc = scan.nextInt();
        }

        System.out.println();
        System.out.println("Thanks for using pattern ");

    }
}
