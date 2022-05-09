package 프로그래머스.프로그래머스_자바입문.Exception;

public class BizService {
    public void bizMethod(int i)throws BizException{
        System.out.println("비즈니스 로직이 시작됩니다.");
        if(i<0){
            throw new BizException("매개변수i는 0이상이어야함다.");
        }
        System.out.println("비즈니스 로직이 종료됩니다");
    }
}
