package 프로그래머스.javastudy;

public class BizException extends RuntimeException{
    public BizException(String msg){
        super(msg);
    }
    public BizException(Exception ex){
        super(ex);
    }
}
//super
//부모클래스에 전달