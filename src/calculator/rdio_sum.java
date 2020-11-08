package calculator;

import java.util.Scanner;

public class rdio_sum {

    public rdio_sum(){

    }

    public static void  reverdio(){

        int row;
        int coll;
        int SumOfDio = 0;

        Scanner array = new Scanner(System.in);

        int [][] arr = new int [3][3];

        arr[0][0] = array.nextInt();
        arr[0][1] = array.nextInt();
        arr[0][2] = array.nextInt();

        arr[1][0] = array.nextInt();
        arr[1][1] = array.nextInt();
        arr[1][2] = array.nextInt();

        arr[2][0] = array.nextInt();
        arr[2][1] = array.nextInt();
        arr[2][2] = array.nextInt();


        System.out.printf("Matrix is \n");


        System.out.print("\t"+arr[0][0]);
        System.out.print("\t"+arr[0][1]);
        System.out.print("\t"+arr[0][2]);

        System.out.println();

        System.out.print("\t"+arr[1][0]);
        System.out.print("\t"+arr[1][1]);
        System.out.print("\t"+arr[1][2]);

        System.out.println();

        System.out.print("\t"+arr[2][0]);
        System.out.print("\t"+arr[2][1]);
        System.out.print("\t"+arr[2][2]);

        System.out.println();

        SumOfDio = SumOfDio + arr[0][2] + arr[1][1] + arr[2][0];

        System.out.printf("\nSum of Reverse Diagonal Matrix is "+SumOfDio);

        System.out.println();


    }


}
