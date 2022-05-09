package 혼공자;

public class DmbCellPhone extends CellPhone {
    //필드
    int channel;

    //생성자
    DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    void turnOnDmb(){
        System.out.println("채널 "+ channel+"번 디엠비방송수신시작");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꿈다.");
    }
    void turnOffDmb(){
        System.out.println("DMB방송수신을 멈춤");
    }
}
