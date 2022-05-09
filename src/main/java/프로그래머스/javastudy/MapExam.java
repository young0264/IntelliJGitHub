package 프로그래머스.javastudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001","kim");
        map.put("002","lee");
        map.put("003","nam");

        map.put("001","kang");

        System.out.println(map.size());
        System.out.println(map.get("003"));
        System.out.println(map.get("002"));

        Set<String> key2 = map.keySet(); //키만꺼내서 셋 자료구조에 넣어주는거야

        Iterator<String> iter = key2.iterator();
        while(iter.hasNext()){
            String key = iter.next(); //키값을 받아서
            String value = map.get(key); //map이 가지고있는 get메서드를 이용해 key를넣어주면 값이나올거야
            System.out.println(key + ":" + value);
        }
    }
}
