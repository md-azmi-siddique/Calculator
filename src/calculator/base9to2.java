package calculator;

public class base9to2 {

    public static int base9toBase2(int number){

        int binaryNumber = 0, p = 1;
        while (number != 0) {
            binaryNumber = binaryNumber + p * (number % 2);
            number = number / 2;
            p = p * 10;
        }
        return binaryNumber;

    }
}
