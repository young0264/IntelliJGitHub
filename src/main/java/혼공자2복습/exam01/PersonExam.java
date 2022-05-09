package 혼공자2복습.exam01;

public class PersonExam {
    public static void main(String[] args) {
        Person p1 = new Person("91919","영");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "USA";
        p1.name = "감자밭";

    }
}
