package 혼공자2복습.exam02;

public class Car {
    //field
    public int speed;

    //cons

    //method
    public void speedUp(){
        speed += 1;
    }

    public final void stop(){
        System.out.println("stop car");
        speed = 0;
    }
}
