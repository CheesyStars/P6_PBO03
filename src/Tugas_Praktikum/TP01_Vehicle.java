package Tugas_Praktikum;

//Membuat abstrak class
public abstract class TP01_Vehicle {
    //Membuat variabel
    protected String name;
    protected String color;
    protected double weight;
    protected double maxSpeed;

    //Membuat method abstrak
    public abstract void start ();
    public abstract void stop ();
    public abstract void sound ();
    public void displayDetails () {
        System.out.println(name);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(maxSpeed);
    };
}
