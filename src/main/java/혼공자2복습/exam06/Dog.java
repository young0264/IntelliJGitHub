package 혼공자2복습.exam06;

public class Dog extends Animal {
    public Dog(){
        this.kind = "포유류";
    }
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
