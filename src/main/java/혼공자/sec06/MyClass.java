package 혼공자.sec06;

public class MyClass {
    //Field
    RemoteControl rc = new Television();

    //Constructor
    MyClass(){

    }
    MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    //Method
    void MethodA(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }
    void methodB(RemoteControl rc){
        rc.turnOn();
        rc.setVolume(5);
    }
}
