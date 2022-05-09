package 혼공자2복습.TT;

public class Thread1Exam {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("*");
        Thread1 t2 = new Thread1("-");

        t1.start();
        t2.start();

        System.out.println("!!!");

    }
}
