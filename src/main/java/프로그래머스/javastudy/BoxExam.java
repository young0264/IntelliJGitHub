package 프로그래머스.javastudy;

public class BoxExam {
    public static void main(String[] args) {
    //    Box box = new Box();
    //    box.setObj(new Object());
    //    Object obj = box.getObj();
    //
    //    box.setObj("hello");
    //    String str = (String)box.getObj(); //형변환
    //    System.out.println(str);
    //
    //    box.setObj(1);
    //    int  value = (int) box.getObj();

        Box<Object> box = new Box<>(); // 일반적인경우
        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> box2 = new Box<>(); // 스트링타입만받아. 형변환필요x
        box2.setObj("Hii");
        String str = box2.getObj();

        Box<Integer> box3 = new Box<>(); //정수형만 받게. 형변환필요x
        box3.setObj(4);
        int v2 = box3.getObj();
    }
}
