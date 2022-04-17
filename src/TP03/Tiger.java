package TP03;

public class Tiger extends Feline {

    public Tiger (String pName, String pFood, String pLocation) {
        name = pName;
        food = pFood;
        location = pLocation;
    }

    @Override
    public void makeNoise () {
        System.out.println("Sound Of " +name+ " : Gr...Gr...Gr");
    }

    @Override
    public void eat () {
        System.out.println(name+ " Tiger Is Eating " +food);
    }
}
