package 프로그래머스.javastudy;

public class MyCal implements Calculator{
    @Override
    public int plus(int i, int j) {
        return i+j;
    }

    @Override
    public int multiple(int i, int j) {
        return i*j;
    }
}

