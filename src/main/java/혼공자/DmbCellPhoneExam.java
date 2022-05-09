package 혼공자;

public class DmbCellPhoneExam {
    public static void main(String[] args) {
        //dmbcellp 객체생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);

        //cellphone클래스로부터 상속받은 필드들
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        //DmbCellPhone클래스의 필드
        System.out.println("채널 : " + dmbCellPhone.channel);

        //Cellphone클래스로부터 상속받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.powerOff();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요.");
        dmbCellPhone.receiveVoice("ㅎㅇ 나 홍길동");
        dmbCellPhone.sendVoice("yesiam");
        dmbCellPhone.hangUp();

        //DmbCellOhone 클래스의 메소드호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
