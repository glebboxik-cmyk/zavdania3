package ex02;

public class MainTest {
    public static void main(String[] args) {
        ViewResult vr = new ViewResult();
        vr.viewInit();

        if (vr.getItems().size() > 0) {
            System.out.println("Test Collection: ok");
        } else {
            System.out.println("Test Collection: Pomylka");
        }
    }
}
