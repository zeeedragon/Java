package softuni;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Some1000DaysAfterBirth {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        DateFormat sourceFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateAsString = in.nextLine();
        Date date = sourceFormat.parse(dateAsString);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 999);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String output = sdf.format(c.getTime());
        System.out.println(output);

    }
}
