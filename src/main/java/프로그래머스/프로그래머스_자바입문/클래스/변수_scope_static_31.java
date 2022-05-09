package 프로그래머스.프로그래머스_자바입문.클래스;

public class 변수_scope_static_31 {
    int globalScope = 10;
    static int staticVal = 7;
    public void scopeTest(int value) {
        int localScope = 20;
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(value2);
    }

    //클래스는 붕어빵의 틀. 모든클래스는 인스턴스화 하지않은채로 사용불가능
    // 키워드 static을 사용하면 인스턴스화 하지 않아도 사용할 수 있다.
    public static void main(String[] args){
 //       System.out.println(globalScope);
 //       System.out.println(localScope);
 //       System.out.println(value);
        System.out.println(staticVal); //스태틱하게 바꾸면 되네

        변수_scope_static_31 v1 = new 변수_scope_static_31();
        System.out.println(v1.globalScope);
        변수_scope_static_31 v2 = new 변수_scope_static_31();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
        System.out.println(변수_scope_static_31.staticVal);//클래스이름.클래스변수명

    }

}
