package 프로그래머스.프로그래머스_자바입문.연산자;

public class 삼항연산자_14 {
    public static void main(String[] args){
        int b1 = (5 < 4) ? 50 : 40; // 참이라면 첫번째가 b1 거짓이면 두번째값이 b1
        System.out.println(b1);

        int b2 = 0;
        if(5>4){
            b2 = 50;
        }else{
            b2 = 40;
        }
        System.out.println(b2);


    }
}
