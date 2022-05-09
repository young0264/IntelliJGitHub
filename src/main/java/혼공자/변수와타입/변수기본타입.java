package 혼공자.변수와타입;

public class 변수기본타입 {
    public static void main(String[] args) {

        int var1 = 0b1011;
        int var2 = 013;
        int var4 = 0xB3;
        char c1 = 'A';
        char c2 = 65;
        float f1 = 3.14f; //float, double 형태차이
        double d1 = 3.14;
        boolean stop = true;
        boolean start = false;
        char char_value = 'A';  //2바이트의 char타입에서 4바이트의 int로 변환.
        int int_value = char_value; //변환 초기화시에는 변수명으로 //거꾸로는 안돼!. 유니코드에 마이너스가 있을수있어서 자바는 허용치않아
        int value = 44032;
        byte byte_value = (byte) value; //강제타입변환    byte : 1byte
        char charvalue = (char) value;  // char : 2byte
        long longvalue = 8;         // long : 8byte
        int intvalue = (int) longvalue; // int : 4 byte
        float floatvalue = 3.14f;
        intvalue = (int) floatvalue;
        if (stop){System.out.println("중지합니다");

        }else{System.out.println("시작합니다");

        }
        System.out.println(intvalue);

    }

}


