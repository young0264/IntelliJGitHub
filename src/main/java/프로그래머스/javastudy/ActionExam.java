package 프로그래머스.javastudy;
//익명클래스.//익명중첩클래스 이름없는객체 action이라고하는 참조변수가 참조하도록
public class ActionExam {
    public static void main(String[] args) {
       // Action action = new MyAction();
       // action.exec();
        Action action = new Action() {//이름없는 객체만들기
            @Override
            public void exec() {
                System.out.println("exec");

            }
        };
        action.exec();
    }
}

