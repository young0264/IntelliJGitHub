package 프로그래머스.프로그래머스_자바입문.조건문_if_switch;

public class 배열만들기_19 {
    public static void main(String[] args){
        int[] array1 = new int[100];//배열크기를 정해야돼
        array1[0] = 50; // 값이 아니라 메모리를 가르키고 있는거야
        int[] array2 = new int[]{1,2,3,4};
        int[] array3 = {1,2,3,4}; // 1차원배열

        System.out.println(array3[3]);
        int value = array3[0];

        System.out.println(value);


    }
}
