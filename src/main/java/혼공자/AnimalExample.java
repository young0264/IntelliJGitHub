package 혼공자;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        Animal animal = null;

        animal = new Dog();
        animal.sound();//하상자식ㄷ쪽에서 호출된거

        animal = new Cat();
        animal.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
