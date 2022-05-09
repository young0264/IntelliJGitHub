package 프로그래머스.javastudy;
//throw 사용
public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        }catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }//메서드 내부에서 처리하지않고 메서드를 호출한쪾에 throws해서 처리하는 방법
    }

    public static int divide(int i, int j)throws IllegalArgumentException{
        if(j==0){
            //System.out.println("2번째 매개변수는 0이면 안됩니다");
            //return 0;
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        int k = i/j;
        return k;
    }
}
//throws + 발생할exception