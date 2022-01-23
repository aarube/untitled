public class Screen {

    private final double diagonal;

    private final double screenWeight;

    private final ScreenType screenType;

    public Screen(double diagonal, double screenWeight, ScreenType screenType) {
        this.diagonal = diagonal;
        this.screenWeight = screenWeight;
        this.screenType = screenType;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public double getScreenWeight() {
        return screenWeight;
    }

    public String toString() {
        return "\nТип матрицы: " + getScreenType() +
                "\nДиагональ: " + getDiagonal() + " Дюйм.";
    }
}
