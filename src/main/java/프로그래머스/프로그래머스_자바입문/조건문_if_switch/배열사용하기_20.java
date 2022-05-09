package 프로그래머스.프로그래머스_자바입문.조건문_if_switch;

public class 배열사용하기_20 {
    public static void main(String[] args){
        int[] iarray = new int[100];
        iarray[0] = 1;
        iarray[1] = 2;
        int sum = 0;

        //System.out.println(iarray.length);
        //iarray에 인덱스0~99, 값1~100을 넣어주고
        for(int i = 0; i < iarray.length; i++){
            iarray[i] = i+1;
        }//i는 여기서 없어져
        //인덱스 0부터 99까지의 값을 sum에 합해 넣어줘서 출력
        for(int i = 0; i < iarray.length; i++){
            //여기에 total변수를 설정하면 for블럭 밖에서 사용 못해
            sum += iarray[i];
        }
        System.out.println(sum);
    }
}
