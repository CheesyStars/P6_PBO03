package TP03;

public class TestAnimal {
    public static void main(String[] args) {
        Hippo hippo = new Hippo("Baduy", "Twig", "Field");
        hippo.displayInfo();
        hippo.makeNoise();
        hippo.eat();
        System.out.println();

        Lion lion = new Lion("Jago", "Meat", "Forest");
        lion.displayInfo();
        lion.makeNoise();
        lion.eat();
        lion.roam();
        System.out.println();

        Tiger tiger = new Tiger("Koko", "Meat", "Forest");
        tiger.displayInfo();
        tiger.makeNoise();
        tiger.eat();
        tiger.roam();
        System.out.println();

        Cat cat = new Cat("Jhonny", "Fishy", "Home");
        cat.displayInfo();
        cat.makeNoise();
        cat.eat();
        cat.roam();
        cat.beFriendly();
        cat.play();
        System.out.println();

        Wolf wolf = new Wolf("Susi", "Meat", "Forest");
        wolf.displayInfo();
        wolf.makeNoise();
        wolf.eat();
        wolf.roam();
        System.out.println();

        Dog dog = new Dog("Piko", "Meat", "Home");
        dog.displayInfo();
        dog.makeNoise();
        dog.eat();
        dog.roam();
        dog.beFriendly();
        dog.play();
    }
}
