package 프로그래머스.javastudy;

public interface TV {
    public int MIN_VOLUME=0;
    public int MAX_VOLUME=100;
    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
