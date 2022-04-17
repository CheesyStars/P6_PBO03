package TP03;

public class Lion extends Feline {

    public Lion (String Pname, String pFood, String pLocation) {
        name = Pname;
        food = pFood;
        location = pLocation;
    }

    @Override
    public void makeNoise () {
        System.out.println("Sound Of " +name+ ": Grhm...Grhm...Grhm");
    }

    @Override
    public void eat () {
        System.out.println(name+ "Lion Is Eating " +food);
    }
}
