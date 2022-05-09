package 혼공자2복습.exam04;

public class ChildExam {
    public static void main(String[] args) {
        Parent parent  = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();

    }
}
