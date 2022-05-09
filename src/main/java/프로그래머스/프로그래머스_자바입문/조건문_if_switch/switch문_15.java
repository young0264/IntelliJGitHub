package 프로그래머스.프로그래머스_자바입문.조건문_if_switch;

public class switch문_15 {
    public static void main(String[] args){
        //switch, case, default, break
        int value = 1;

        switch(value){//value가 들어왓을때 case안에있는거 사용가능
            case 1:
                System.out.println("프로그래머스/javastudy");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default: //else
                System.out.println("그 외 다른 숫자");
        }
        //jdk7이후부터는 문자열을 가지고도 switch문을 실행가능
        String str = "A";
        switch(str){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
        }
    }
}
