package 혼공자2복습.TT;

public class Thread2Exam {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2("*");
        Thread2 t2 = new Thread2("-");


        Thread tread1 = new Thread(t1);
        Thread tread2 = new Thread(t2);
    }
}
