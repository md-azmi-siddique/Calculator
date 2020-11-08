package calculator;

import java.util.Scanner;

public class check0and1 {

    public static void check(){
        int i ;
        int j;

        int arr[][] = new int[3][3];

        Scanner arro = new Scanner(System.in);

        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){

                arr[i][j] = arro.nextInt();

            }

        }

        System.out.printf("Array is :\n");

        for(i = 0 ; i < 3 ; i++){

            for(j = 0; j< 3 ; j++){

                System.out.printf("\t"+arr[i][j]);

            }

            System.out.println();

        }


        System.out.println("After Converting");

        for(i = 0 ; i< 3 ; i++){

            for(j = 0 ; j<3 ; j++){

                if(arr[i][j]<0 ){

                    //arr[i][j]=0;
                    System.out.printf("\t 1 \t");

                }

                else if (arr[i][j] > 0 ){

                    System.out.printf("\t 0 \t");

                }

                else if(arr[i][j] == 0 ){

                    System.out.printf("\t -1 \t");

                }

            }

            System.out.println();
        }

    }
}
