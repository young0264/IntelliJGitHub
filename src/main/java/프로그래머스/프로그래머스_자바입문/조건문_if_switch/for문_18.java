package 프로그래머스.프로그래머스_자바입문.조건문_if_switch;

public class for문_18 {
    public static void main(String[] args){
        int total = 0;
        for(int i = 1; i<= 100; i++){
   //        if(i%2 != 0){//홀수는 continue
   //            continue;
   //        }
            total = total + i;
            if(i == 50){
                break;
            }
        }
        System.out.println(total);
    }
}
