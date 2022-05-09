package 프로그래머스.프로그래머스_자바입문.클래스;
//접근제한자에 따라서 해당클래스,필드 어디까지 접근.사용. 정의가능
public class AccessObjExam {
    public static void main(String[] args) {

        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        System.out.println(obj.p2);
        System.out.println(obj.k);
        //System.out.println(obj.i);
    }

}
