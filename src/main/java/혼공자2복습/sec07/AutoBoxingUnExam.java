package 혼공자2복습.sec07;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class AutoBoxingUnExam {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int month = now.get(Calendar.MONTH);
        System.out.println(month+1);

        LocalDateTime mon = LocalDateTime.now();
        System.out.println(mon);

    }
}
