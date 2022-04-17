package Tugas_Praktikum;

public class TP01_Motorcycle extends TP01_Vehicle {
    //Membuat method
    public TP01_Motorcycle (String name, String color, double weight, double maxSpeed) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start () {
        System.out.println("Kendaraan Bergerak!");
    }

    @Override
    public void stop () {
        System.out.println("Kendaraan Berhenti!");
    }

    @Override
    public void sound () {
        System.out.println("Sepeda Motor Membunyikan Klakson!");
    }
}
