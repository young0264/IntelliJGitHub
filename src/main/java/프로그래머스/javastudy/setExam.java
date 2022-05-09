package 프로그래머스.javastudy; //중복없게 자료구조. 해시셋.트리셋

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); //set을구현한 클래스인 hashset
        boolean flag1 = set1.add("kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");

        System.out.println(set1.size());

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()){
            String str = iter.next(); //하나꺼내고 다음거참조
            System.out.println(str);


        }

    }
}
