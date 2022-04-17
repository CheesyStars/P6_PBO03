public class P07_TestButton {
    public static void main(String[] args) {
        //Membuat objek
        P07_Button btn = new P07_Button();

        //Membuat class anonymous untuk implementasi interface
        btn.setClickAction(new P07_Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol Sudah Diklik");
                System.out.println("Ya");
            }
        });

        //Mencoba klik tombol
        btn.doClick();
    }
}
