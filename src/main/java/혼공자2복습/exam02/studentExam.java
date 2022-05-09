package 혼공자2복습.exam02;

import javax.xml.namespace.QName;

public class studentExam {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "91292",123);
        System.out.println("name "+ student.name);
        System.out.println("ssn "+student.ssn);
        System.out.println("stuNo "+student.studentNo);
    }
}
