package 프로그래머스.javastudy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1.toString()); //tostring으로

        SimpleDateFormat ft = new SimpleDateFormat("yy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date1));//date객체넣어서 Format사용해서 출력해야

        System.out.println(date1.getTime());

        long today = System.currentTimeMillis();
        System.out.println(today);

        System.out.println(today - date1.getTime());


    }
}
