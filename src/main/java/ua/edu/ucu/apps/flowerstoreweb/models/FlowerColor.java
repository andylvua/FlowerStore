package ua.edu.ucu.apps.flowerstoreweb.models;

public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00"),
    YELLOW("#FFFF00"),
    ORANGE("#FFA500"),
    PURPLE("#800080"),
    PINK("#FFC0CB"),
    BROWN("#A52A2A"),
    WHITE("#FFFFFF"),
    BLACK("#000000");

    private final String color;

    FlowerColor(final String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return color;
    }
}
