package 프로그래머스.javastudy;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        try{
        int k = i/j;
        System.out.println(k);
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다."+e.toString());
            // 예외클래스변수명.toString() : 예외의 정보를 알려주는 메소랴
        }finally{
            System.out.println("오류가발생올낫 무조건실행!");
        }
        System.out.println("main end!");
    }
}
//예외사항에 Exception 을 넣어주면 모든 오류를 제외