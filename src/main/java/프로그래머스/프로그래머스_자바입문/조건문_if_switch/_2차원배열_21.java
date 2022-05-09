package 프로그래머스.프로그래머스_자바입문.조건문_if_switch;

public class _2차원배열_21 {
    public static void main(String[] args){
        int[][] array4 = new int[3][4];
        array4[0][1] = 10;

        int[][] array5 = new int[3][];
        array5[0] = new int[1];
        array5[0] = new int[2];
        array5[0][0] = 10;

        int[][] array6 = {{1},{1,2},{1,2,3}}; //초기화와 동시에 값생성
        System.out.println(array6[1][1]);
    }
}
