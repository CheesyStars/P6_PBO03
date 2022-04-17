public class P07_Button {
    //Membuat variabel
    private P07_Clickable action;

    //Membuat method
    void setClickAction (P07_Clickable action) {
        this.action = action;
    }

    void doClick () {
        action.onClick();
    }
}
