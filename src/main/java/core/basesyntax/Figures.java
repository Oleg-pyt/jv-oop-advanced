package core.basesyntax;

public abstract class Figures implements AreaCalculation, Drawable {
    private Color color;

    public Figures(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
