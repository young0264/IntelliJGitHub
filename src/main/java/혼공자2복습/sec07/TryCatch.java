package 혼공자2복습.sec07;

public class TryCatch {
    public static void main(String[] args) {
        //String str = null;
        //System.out.println(str.length());

        try {
            Class clazz = Class.forName("java.lang.String");
            System.out.println("정상실행");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않아요");
        }

    }
}
