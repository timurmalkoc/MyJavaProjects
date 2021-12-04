package Polymorphism;

public class FruitMain {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setColor("Red");
        System.out.println(apple.getColor());
        apple.makeJuice();
        apple.removeSeeds();
        calories(apple);


        Fruit banana = new Banana();
        banana.setColor("Yellow");
        System.out.println(banana.getColor());
        banana.makeJuice();
        ((Banana) banana).peel();
        calories(banana);


    }

    public static void calories(Fruit fruit){
        if (fruit instanceof Banana)
            System.out.println("100 calories");
        else
            System.out.println("50 calories");
    }
}
