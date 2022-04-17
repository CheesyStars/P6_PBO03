package TP03;

public class Hippo extends Animal {
    public Hippo (String pName, String pFood, String pLocation) {
        name = pName;
        food = pFood;
        location = pLocation;
    }

    @Override
    public void makeNoise () {
        System.out.println("Sound Of " +name+ " : Mbroooooughhhhhh");
    }

    @Override
    public void eat () {
        System.out.println(name+ " Hippo Is Eating " +food);
    }
}
