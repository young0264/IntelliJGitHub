package javalang;

import java.io.IOException;

public class KeyboardExam {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes, 0 , readByteNo-1);
        System.out.println(str);

        String subject = "자바프로그래밍";
        char cval = subject.charAt(3);
        System.out.println(cval);

    }

}
