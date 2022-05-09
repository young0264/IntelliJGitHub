package 혼공자.sec03;

public interface RemoteControl { // 리모콘을 통해서
    //상수
    //public static final
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //메소드
    void turnOn();              //켜고 끄고 볼륨조절
    void turnOff();
    void setVolume(int volume);
}
