package 혼공자2복습.exam02;

public class SuperSonicExam {
    public static void main(String[] args) {
        SuperSonicAirplane sa = new SuperSonicAirplane();
        sa.takeOff();
        sa.fly();

        sa.flymode = SuperSonicAirplane.SUPERSONIC;
        sa.fly();
    }
}
