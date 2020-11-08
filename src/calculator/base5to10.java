package calculator;

public class base5to10 {

    public static int base5toBase10(int n){
        int decNum = 0;
        int nexInt;
        int i = 0;
        while(n != 0){
            nexInt = n%10;
            decNum=(int)(decNum+nexInt*Math.pow(5,i));
            n=n/10;
            i++;
        }
        return decNum;
    }

}
