package 프로그래머스.프로그래머스_자바입문.참조타입;//특정값만 가져다 사용할떄 열거열사용

public class 열거형_enum_32 {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;//변수선언
        gender1 = 열거형_enum_32.MALE;
        gender1 = 열거형_enum_32.FEMALE; //값부여

        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        //gender2 = "boy";
    }
}
enum Gender{
    MALE,FEMALE;
}

