package 혼공자2복습.exam02;

public class SuperSonicAirplane extends AirPlane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flymode = NORMAL;

    @Override
    public void fly() {
        if(flymode == SUPERSONIC){
            System.out.println("초음속비행한다");
        }else{
            super.fly();
        }
    }
}
