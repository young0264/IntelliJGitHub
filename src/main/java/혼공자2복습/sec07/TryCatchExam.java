package 혼공자2복습.sec07;

public class TryCatchExam {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        }catch(Exception e){
            System.out.println("실행 매개값의 수가 부족합니다.");
            return;
        }
        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
        }catch(NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다.");
        }finally{
            System.out.println("다시실행해라 마");
        }
        String str = "감자바";
    }
}
