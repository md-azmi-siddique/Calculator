package calculator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class fdio_sum {

    public fdio_sum(){

    }

    public static void  fdiosum(){

        int row;
        int coll;
        int SumOfDio = 0;
        Scanner array = new Scanner(System.in);

        int [][] arr = new int [3][3];

        for(row = 0 ; row < 3 ; row++){

            for(coll = 0 ; coll < 3 ; coll++){

                arr[row][coll] = array.nextInt();

            }

        }

        System.out.printf("Matrix is \n");

        for(row = 0 ; row < 3 ; row++){

            for(coll = 0 ; coll < 3 ; coll++){

                System.out.printf("\t"+arr[row][coll]);

            }

            System.out.println();

        }


        for(row = 0 ; row < 3 ; row++){

            for(coll = 0 ; coll < 3 ; coll++){

                if(row == coll)
                {
                    SumOfDio = SumOfDio + arr[row][coll];

                }

            }

        }


        System.out.printf("Sum of Diagonal Matrix is "+SumOfDio);

        System.out.println();
    }


}
