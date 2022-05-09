package 프로그래머스.프로그래머스_자바입문.클래스;
//concat : 결합
public class String클래스의메소드_30 {
    public static void main(String[] args){
        //String str = new String("hello");
        String str = "hello";
        System.out.println(str.length());   //문자열 길이 반환
        System.out.println(str.concat(" world")); // 문자열 합치기(얕복)
        System.out.println(str);
        str  = str.concat(" world");        // 문자열 새로 초기화.
        System.out.println(str);

        System.out.println(str.substring(3));//슬라이싱. 3부터시작
        System.out.println(str.substring(3,6));
    }
}
