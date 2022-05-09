package 혼공자2복습.sec07;

public class ClassCast {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
        //Animal animal = new Dog();
        //Dog dog2 = (Dog) animal;
//
        //Cat cat = new Cat();
        //Animal animal2 = dog2;
        //Cat cat2 = (Cat) animal2;

    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {//애니멀이 참조하고있는 객체가 dog객체냐
            Dog dog = (Dog) animal;
        }
    }
}
