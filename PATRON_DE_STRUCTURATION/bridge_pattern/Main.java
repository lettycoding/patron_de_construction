package PATRON_DE_STRUCTURATION.bridge_pattern;

public class Main {
    public static void main(String[] args) {
        shapes redCircle = new Circle(new RedColor());
        shapes blueCircle = new Circle(new BlueColor());
        redCircle.colorit();
        blueCircle.colorit();
    }

}
