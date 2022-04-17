package Tugas_Praktikum;

//Membuat absrak class
public class TP01_TestVehicle {
    public static void main(String[] args) {
        //Membuat objek
        TP01_Car car = new TP01_Car("Ferrari 812 Superfast", "Red", 1525.0, 339.60);
        TP01_Motorcycle motorcycle = new TP01_Motorcycle("Ducati 1098s", "Red", 173.0, 271.0);

        //Menampilkan objek
        car.displayDetails();
        System.out.println();
        motorcycle.displayDetails();

        System.out.println();

        car.start();
        car.sound();
        car.stop();

        System.out.println();

        motorcycle.start();
        motorcycle.sound();
        motorcycle.stop();
    }
}