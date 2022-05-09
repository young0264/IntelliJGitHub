package 프로그래머스.프로그래머스_자바입문.변수_상수_타입변환;

public class BusExam {

    public static void main(String[] args){
        Car c = new Bus(); //부모타입인 Car로 자식인 Bus를 가르킴
        c.run();
        //c.ppangppang();
        //부모가 자식을 가르킬 수 있다.
        //이경우 부모가 가지고 있는 내용만 사용가능
        Bus bus = (Bus)c; //형변환//Car 타입인 c를 버스가 가르킬 순 없어.
        bus.run();
        bus.ppangppang();

    }

}
