package 프로그래머스.프로그래머스_자바입문.연산자;

public class 논리연산자_13 {
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);
        System.out.println(b2 || b2);
        System.out.println(b1 ^ b2);

        int score = 69;
        if(score <= 100 && score >=70){
            System.out.println("성공");
        }else{
            System.out.println("실패");
        }

        System.out.println(b1);
        System.out.println(!b1);


    }
}
