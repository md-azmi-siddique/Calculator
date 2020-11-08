package calculator;

public class base9to10 {

    public static int base9toBase10(int n){
        int decNum = 0;
        int nexInt;
        int i = 0;
        while(n != 0){
            nexInt = n%10;
            decNum=(int)(decNum+nexInt*Math.pow(9,i));
            n=n/10;
            i++;
        }
        return decNum;
    }

}
