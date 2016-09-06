package softuni;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAfter5Days {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String day = in.nextLine();
        String month = in.nextLine();
        int year = 2015;
        String date = day + "." + month + "." + year;
        in.close();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date parse =  sdf.parse(date);
        Calendar c = Calendar.getInstance();
        c.setTime(parse);
        c.add(Calendar.DATE, 5);
        System.out.println(parse);
        System.out.print(c.get(Calendar.DATE) + ".");
        if((c.get(Calendar.MONTH)  + 1) < 10){
            System.out.print("0" + (c.get(Calendar.MONTH) + 1));
        } else {
            System.out.print((c.get(Calendar.MONTH) + 1));
        }
    }
}
