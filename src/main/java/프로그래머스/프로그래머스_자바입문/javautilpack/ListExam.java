package 프로그래머스.프로그래머스_자바입문.javautilpack;
import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("kim");
        arr.add("nam");
        arr.add("kim");

        System.out.println(arr.size());
        //System.out.println(arr.get[1]);
        String ans = arr.get(2);
        System.out.println(ans);
        System.out.println(arr);

    }
}
