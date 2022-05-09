package 프로그래머스.프로그래머스_자바입문.조건문_if_switch;

public class if문_12 {
    public static void main(String[] args){
        int x = 50;
        int y = 60;
        if(x < y) {
            System.out.println("x는 y보다 작습니다.");
            System.out.println("test1");

        }   //중괄호 한개 더 생성
//       if(x < y)
//           System.out.println("x는 y와 같습니다");// 중괄호로 안묶여있어서 이것만 포함됨
//           System.out.println("test2");
//       System.out.println("test3");
//       if(x==y)
//           System.out.println("x와 y는 같습니다.");
        if(x==y){
            System.out.println("x는 y와 같습니다.");
        }else if(x<y){
            System.out.println("x는 y보다 작습니다.");
        }else{
            System.out.println("x는 y와 다릅니다.");
        }



    }
}
