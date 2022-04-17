package Tugas_Praktikum;

public class TP03_TestInnerClass1 {
    static String test = "Outer Class Static Field";
    String instFid = "This Is An Instance Field";

    public static void main(String[] args) {
        System.out.println(Inner.value);
        new Inner();
    }

    static class Inner {
        static int value = 100;

        Inner () {
            System.out.println("New Static Inner Class");
            System.out.println(test);
            String insFid = "Ini Adalah Variabel insFid";
            System.out.println(insFid);
            //Can create an instance of the outer class and then
            //access instance fields
            TP03_TestInnerClass1 tsi = new TP03_TestInnerClass1();
            System.out.println(tsi.instFid);
        }
    }
}
