package 프로그래머스.javastudy;

public class ExceptionExam2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        }catch(ArithmeticException e){
            System.out.println("처리했어"+e.toString());
        }
    }
    public static int divide(int i, int j) throws ArithmeticException{
        int k = i/j;
        return k;
    }
}
//throws + 발생할exception