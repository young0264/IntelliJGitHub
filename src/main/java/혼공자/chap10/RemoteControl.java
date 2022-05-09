package 혼공자.chap10;

public interface RemoteControl {
    //public static final int MAX_VOLUME = 10;
    //상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
