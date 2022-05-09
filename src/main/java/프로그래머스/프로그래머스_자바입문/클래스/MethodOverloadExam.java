package 프로그래머스.프로그래머스_자바입문.클래스;

public class MethodOverloadExam {
    public static void main(String[] args){
        MyClass2 m = new MyClass2();
        System.out.println(m.plus(5,6));
        System.out.println(m.plus(4,5,6));
        System.out.println(m.plus("의","영"));

    }
}
