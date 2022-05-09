package javalang;

public class ByteToStringExam {
    public static void main(String[] args) {
        byte[] bytes = {72,101,49,54,35,34};
        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes,2, 3);
    }
}
