//object와 오버라이딩
package 프로그래머스.javastudy;

public class Student {
    String name;    //이름,학번,생년필드
    String number; //필드
    int birthYear;

    public Student() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Student [name=" + name+",number=";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1995;

        if(s1.equals(s2))
            System.out.println("s1==s2");
        else
            System.out.println("s1!=s2");

        System.out.println(s1.hashCode()); //해시코드가 서로 달라.
        System.out.println(s2.hashCode());
        System.out.println(s2);

    }
}
