package 프로그래머스.프로그래머스_자바입문.javautilpack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("nam");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("nam");

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        Iterator<String> iter = set1.iterator(); //iterator를 구현한 객체
        while(iter.hasNext()){//빌때까지 꺼내오기
           String str =  iter.next(); //값을꺼내줘/string타입으로
            System.out.println(str);
        }
    }
}
