package javalang;

public class Car {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Car.class;

        Class clazz2 = Class.forName("javalang.Car");

        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println(clazz ==clazz2);
        System.out.println(clazz ==clazz3);

        System.out.println(clazz.getName());//패키지포함 이름출력
        System.out.println(clazz.getSimpleName());//패키지제외 이름출력
        System.out.println(clazz.getClass().getName());
    }
}
