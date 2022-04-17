public class P08_TestButton2 {
    //Membuat variabel di dalam inner class
    static String title = "Tutorial Anonymous Class";

    public static void main(String[] args) {
        //Membuat variabel di dalam method main
        String name = "Rekayasa Perangkat Lunak";
        P07_Button btn = new P07_Button();

        //Membuat class anonymous untuk implementasi interface
        btn.setClickAction(new P07_Clickable() {
            //Membuat variabel di dalam class anonymous
            String message = "Belajar Anonymous Class Di Java";
            @Override
            public void onClick() {
                System.out.println("Tombol Sudah Di Klik");
                System.out.println("Yay!");
                //Mengakses variabel
                System.out.println("Hello " +name);
                System.out.println(title);
                System.out.println(message);
            }
        });
        //Mencoba klik tombol
        btn.doClick();
    }
}
