package TP03;

public abstract class Feline extends Animal {
    @Override
    public void roam () {
        super.roam();
        System.out.println(name+ " Is Feline Group");
    }
}
