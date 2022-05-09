package javalang;

public class MemberExam {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");

        if(obj1.equals(obj2)){ //재정의된 equals반환
            System.out.println("obj1과 obj2는동등합니다.");
        }else{
            System.out.println("obj1과 2는 동등하지않아");    }

    }
}
