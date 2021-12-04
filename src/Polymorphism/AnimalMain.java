package Polymorphism;

public class AnimalMain {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.makeSound();
        rocky.fetch();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);
        ((Cat) sasha).scratch();   /// needed to be cast to access Cat's own fields and methods


    }
    public static void feed(Animal animal){

        if (animal instanceof Dog)
            System.out.println("Dog food");
        else
            System.out.println("Cat food");
    }
}
