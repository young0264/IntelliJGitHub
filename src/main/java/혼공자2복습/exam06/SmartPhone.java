package 혼공자2복습.exam06;

public class SmartPhone extends Phone {
    public SmartPhone(String owner){
        super(owner); //매개변수를 가지는 생성자라면 거기에 맞게 슈퍼를 작성해야(상속)
    }
    //메소드
    public void internetSearch(){
        System.out.println("인터넷 검색을 시작합니다.");
    }

}
