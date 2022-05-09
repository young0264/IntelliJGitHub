package 혼공자2복습.exam01;

public class Person {
    final String nation = "Korean";
    final String ssn;     //값이 지정되면 바꿀수없도록
    String name; //값을 바꿀수잇어.final없j

    //생성자
    Person(String ssn,String name){
        this.ssn = ssn;
        this.name = name;
    }
}
