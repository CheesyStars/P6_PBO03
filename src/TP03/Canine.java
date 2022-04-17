package TP03;

public abstract class Canine extends Animal {
    @Override
    public void roam () {
        super.roam();
        System.out.println(name+ " Is Canine Group");
    }
}
