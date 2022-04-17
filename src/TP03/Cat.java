package TP03;

public class Cat extends Feline implements Pet {

    public Cat (String pName, String pFood, String pLocation) {
        name = pName;
        food = pFood;
        location = pLocation;
    }

    @Override
    public void makeNoise () {
        System.out.println("Sound Of " +name+ " : Miaw...Miaw...Miaw");
    }

    @Override
    public void eat () {
        System.out.println(name+ " Cat Is Eating " +food);
    }

    @Override
    public void beFriendly () {
        System.out.println(name+ " Cat Can Be Friendly With You!");
    }

    @Override
    public void play () {
        System.out.println(name+ " Cat Can Play With You!");
    }

}
