package TP03;

public class Wolf extends Canine {
    public Wolf (String pName, String pFood, String plocation) {
        name = pName;
        food = pFood;
        location = plocation;
    }

    @Override
    public void makeNoise () {
        System.out.println("Sound Of " +name+ " : Hau...Hau...Hauk");
    }

    @Override
    public void eat () {
        System.out.println(name+ " Wolf Is Eating " +food);
    }
}
