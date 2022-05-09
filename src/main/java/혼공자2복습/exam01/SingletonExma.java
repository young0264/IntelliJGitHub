package 혼공자2복습.exam01;

import java.security.Signature;

public class SingletonExma {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
         */
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1==obj2){
            System.out.println("같은 싱글톤객체입니다");
        }else{
            System.out.println("다른 싱글톤객체입니다.");
        }

    }
}
