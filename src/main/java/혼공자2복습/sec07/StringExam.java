package 혼공자2복습.sec07;

import java.util.Locale;

public class StringExam {
    public static void main(String[] args) {
        String subject = "자바프로그래밍";
        String subject2 = "AaBbCcDd";
        String subject3 = "   자  바  프 로 그래 밍";
        int subject4 = 12415;


        int location = subject.indexOf("프로그래밍");
        char a = subject.charAt(3);
        System.out.println(location);
        System.out.println(a);

        String newstr = subject.replace("자바","Java");
        System.out.println(newstr);
        System.out.println(1);

        String newstr2 = subject.substring(0,2);
        String newstr3 = subject.substring(2);
        System.out.println(newstr2);
        System.out.println(newstr3);

        String L1 = subject2.toLowerCase();
        String L2 = subject2.toUpperCase();
        System.out.println(L1);
        System.out.println(L2);

        System.out.println(subject3);
        System.out.println(subject3.trim());

        System.out.println(subject4);
        String svalue = String.valueOf(subject4);
        System.out.println(svalue);
    }
}
