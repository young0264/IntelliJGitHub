package 혼공자;

public class StudentExample {
    public static void main(String[] args){
        Student student = new Student("홍길동","2123124-12414",1 );
        System.out.println("name : " + student.name);
        System.out.println("ssn " + student.ssn);
        System.out.println("studnetno : " + student.studentNo );
    }
}
