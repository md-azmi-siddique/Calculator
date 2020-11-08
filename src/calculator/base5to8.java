package calculator;

public class base5to8 {

    public static int base5toBase8(int number){
        int octNumber= 0, p = 1;
        while(number != 0){
            octNumber = octNumber + p * (number % 8);
            number = number/8;
            p = p*10;
        }
        return octNumber;
    }

}
