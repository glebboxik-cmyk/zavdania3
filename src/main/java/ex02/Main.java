package ex02;

public class Main {
    public static void main(String[] args) {
        Viewable factory = new ViewableResult();
        View v = factory.getView();

        v.viewInit();
        v.viewShow();
        try {
            v.viewSave();
            v.viewRestore();
            v.viewShow();
        } catch (Exception e) {
            System.out.println("Pomylka: " + e.getMessage());
        }
    }
}
