package 프로그래머스.javastudy;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        if(sb2 == sb3)
            System.out.println("sb2==sb3");

        //stirngBuffer는 길이를 길른다거나 자른다거나. String클래스 단점을 극복해서 사용가능. 한줄로끝냄
        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);

    }
}
