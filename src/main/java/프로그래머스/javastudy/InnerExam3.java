package 프로그래머스.javastudy;

public class InnerExam3 {
    public void exec() {
        class Cal {
            int value = 0;
            public void plus() {
                value++;
            }
        }
        Cal cal = new Cal();//메
        cal.plus();//메서드안에서 cal이라는 객체를 생성
        System.out.println(cal.value);//메서드안에서 Cal이갖고있는 value를 호출해서사용
    }
    public static void main(String[] args){
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
} // 메서드안에서도 클래스를 지역변수처럼 선언해서 사용할 수 있다.


