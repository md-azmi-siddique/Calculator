package calculator;

public class base9to16 {

    public static String base9toBase16(int number){
        int hexNumber = 0x0, p = 1;
        while (number != 0) {
            hexNumber = hexNumber + p * (number % 16);
            number = number / 16;
            p = p * 16;
        }
        String hex = Integer.toHexString(hexNumber);
        return hex;


    }

}
