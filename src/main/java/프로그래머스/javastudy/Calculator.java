package 프로그래머스.javastudy;

public interface Calculator  {
    public int plus(int i , int j);
    public int multiple(int i, int j);

    default int exec(int i, int j){ //default 키워드를 이용하여 메소드 구현가능
        return i + j;
    }

    public static int exec2(int i , int j ){//interface에서 정의한 static은
                                        // interface이름을 넣어야함
       return i*j;
    }

}
