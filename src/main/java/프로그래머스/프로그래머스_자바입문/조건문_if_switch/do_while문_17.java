package 프로그래머스.프로그래머스_자바입문.조건문_if_switch;
import java.util.Scanner;
public class do_while문_17 {
    public static void main(String[] args){
        int value = 0;
        Scanner scan = new Scanner(System.in);
//한번은 입력받고 싶어요할때 사용
        do{
            //반복할문장들을 넣어줘
            value = scan.nextInt();
            System.out.println("입력받은 값:"+value);
        }while(value != 10); //10이 아닐때까지 실행하고 싶어
        System.out.println("반복문 종료!");
    }
}
