package 혼공자2복습.exam01;

public class Tire {
    //Field
    public int maxRotation;         //최대회전수.수명
    public int accumulatedRotation; //누적회전수
    public String location;         //타이어위치


    //생성자
    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    //메소드
    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation){
            System.out.println(location + "t수명 "+( maxRotation - accumulatedRotation) + "회");
            return true;
        }else{
            System.out.println("**"+location+" 펑크남");
            return false;
        }
    }
}
