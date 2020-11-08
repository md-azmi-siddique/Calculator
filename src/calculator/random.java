package calculator;

public class random {

    public static void rano(){

        int i;
        int n = (int)(5+Math.random()*((20-5)+1));

        System.out.println("Random Integer: "+n);

        for(i=0;i<n;i++)

        {

            System.out.printf("%d\t",i+1);

        }

    }
}
