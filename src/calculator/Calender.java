package calculator;

import java.util.Calendar;

public class Calender {

    public static void cal(){

        Calendar cal = Calendar.getInstance();

        System.out.println("DATE: "+cal.get(Calendar.DATE));
        System.out.println("MONTH: "+(cal.get(Calendar.MONTH)+1));
        System.out.println("YEAR: "+cal.get(Calendar.YEAR));

    }
}
