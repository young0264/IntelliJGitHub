package 프로그래머스.프로그래머스_자바입문.클래스;

public class String_클래스_25 {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");
        if (str1==str2)
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");
        if (str1!=str3)
            System.out.println("str1과 str3는 다른 레퍼런스입니다.");
        if (str3!=str4)
            System.out.println("str3과 str4는 다른 레퍼런스입니다.");

        System.out.println(str1.substring(3));

        System.out.println(str1);
        System.out.println('가');
        System.out.print("나");

    }
}
