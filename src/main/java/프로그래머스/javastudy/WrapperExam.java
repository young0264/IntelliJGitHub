package 프로그래머스.javastudy;//java.lang패키지의 오토박싱

public class WrapperExam {
    public static void main(String[] args) {
        int i = 5;
        Integer i2 = new Integer(5); // 기본데이터 타입을 객체타입으로 바꿀땐
                                            // 위와같이 new Integer 등으로 감싸줬어야햇는데
                                        //자바 5이후부터는 i2가아니라 i3처럼해도됨
                                        //'오토박싱'이라고 함
        Integer i3 = 5; //자동으로 ingeger로 형변환된 상황
                       //new Integer(5)로 인식함

        int i4 = i3.intValue();//이런메서드이용.cuz 객체로 감싸져잇는걸 벗겨내고 int타입으로 사용할
                                //수있엇지만
        int i5 = i3;
    }
}


