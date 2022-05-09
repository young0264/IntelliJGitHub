package 혼공자2복습.exam06;

public class AnimalExam {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        Animal animal = null;
        animal = new Cat();////////
        animal.sound();

        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {////////
        animal.sound();


    }

}
