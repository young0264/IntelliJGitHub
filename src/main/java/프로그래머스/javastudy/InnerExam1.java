package 프로그래머스.javastudy;

public class InnerExam1 {
    class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1();
        InnerExam1.Cal cal = t.new Cal();//Cal이라는 객체 생성. 사용하기위해선 변수선언해야지
        cal.plus();
        System.out.println(cal.value);//필드 접근 사용

    }
}
