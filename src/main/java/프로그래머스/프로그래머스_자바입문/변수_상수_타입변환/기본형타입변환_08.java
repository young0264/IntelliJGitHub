package 프로그래머스.프로그래머스_자바입문.변수_상수_타입변환;

public class 기본형타입변환_08 {
    public static void main(String[] args){
        int x = 50000;
        long y = x; // 형변환가능 // 묵시적형변환 이라
        float v2 = 1e2f;
        long x2 = 5;
        int y2 = (int)x2;   //작은 그릇으로 가는거지만 형변환.
                            //강제형변환이라 함

        System.out.println(v2);
    }

}
