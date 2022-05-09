package 프로그래머스.프로그래머스_자바입문.조건문_if_switch;

public class for_each_22 {
    public static void main(String[] args){
        int[] iarr = {10,20,30,40,50};

        for(int i = 0; i < iarr.length; i++){
            int value = iarr[i];
            System.out.println(value);
        }
        //for(타입값을 받아줄 변수명 : 출력하고 싶은 자료구조)
        //이게 for each문. 하나씩 빼
        for(int value : iarr){
            System.out.println(value);
        }
    }
}
