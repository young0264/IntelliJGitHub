package 프로그래머스.프로그래머스_자바입문.Exception;

public class BizExam {
    public static void main(String[] args){
        BizService biz = new BizService();
        biz.bizMethod(5);
        try{
            biz.bizMethod(-3);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
