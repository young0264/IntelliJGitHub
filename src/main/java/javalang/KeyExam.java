package javalang;

import java.util.HashMap;

public class KeyExam {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String, String>();

        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key1","value3");

        System.out.println(hashMap.size()); //
    }
}
