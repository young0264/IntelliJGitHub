package 프로그래머스.javastudy;

public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(5); // 5번째부터 잘라서 새로운 문자열을 반환하는 메서드. substring
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = new StringBuffer().append(str1).append(str2).toString(); //stingbuffer 라는 클래스를 생성하고 // to String
        System.out.println(str4);

        String str5="";
        for (int i=0; i<100 ; i++){
            str5 = str5+"*"; // 문자열을 반복문안에서 반복하는건 피핼
        }
        System.out.println(str5);

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<100 ; i++) {
            sb.append("*");
        }
        System.out.println(sb); //훨씬효율적인 코드. 문자열을 반복문


    }
}
