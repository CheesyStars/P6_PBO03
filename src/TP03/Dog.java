package TP03;

public class Dog extends Canine implements Pet {
    public Dog (String pName, String pFood, String pLocation) {
        name = pName;
        food = pFood;
        location = pLocation;
    }

    @Override
    public void makeNoise () {
        System.out.println("Sound Of " +name+ " : Gong...Gong...Gong");
    }

    @Override
    public void eat () {
        System.out.println(name+ " Dog Is Eating " +food);
    }

    @Override
    public void beFriendly () {
        System.out.println(name+ " Dog Can Be Friendly With You!");
    }

    @Override
    public void play () {
        System.out.println(name+ " Dog Can Play With You!");
    }
}
