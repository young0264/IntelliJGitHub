package 프로그래머스.javastudy; ///제너릭

public class Box <E>{//제너릭 사용기 E로
    private E obj;

    public void setObj(E obj){
        this.obj = obj;

    }

    public E getObj(){
        return obj;
    }

}
