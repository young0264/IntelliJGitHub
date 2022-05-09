package 프로그래머스.프로그래머스_자바입문.Exception;

public class BizException extends RuntimeException{
    public BizException(String msg){
        super(msg);
    }
    public BizException(Exception ex){
        super(ex);
    }
}
