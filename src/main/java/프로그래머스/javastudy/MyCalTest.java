package 프로그래머스.javastudy;

public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        int t = cal.exec(5, 6);
        int i = cal.multiple(5, 7);
        System.out.println(t);

        Calculator.exec2(3, 4);
    }
}
