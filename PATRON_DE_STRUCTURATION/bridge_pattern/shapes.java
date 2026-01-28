package PATRON_DE_STRUCTURATION.bridge_pattern;

public abstract class shapes {
    Color color;
    shapes(Color color) {
        this.color = color;
    }
    abstract void colorit();

}
