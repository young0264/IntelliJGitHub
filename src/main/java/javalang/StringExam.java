package javalang;

public class StringExam {
    public static void main(String[] args) {
        String strVar1 = new String("의영이");
        String strVar2 = "의영이";
        if(strVar1 == strVar2){ //번지가 같다면
            System.out.println("같은 스트링 객체를 참조");
        }else{
            System.out.println("다아른 스트링 객체를 참조한다.");
        }
        if(strVar1.equals(strVar2)){
            System.out.println("같은문자열을가진");
        }else{
            System.out.println("다른문자열을가진");
        }
    }
}
