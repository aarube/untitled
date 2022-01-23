public class Keyboard {

    private final KeyboardType keyboardType;

    private final KeyboardLight keyboardLight;

    private final double keyboardWeight;

    public Keyboard(KeyboardType keyboardType, KeyboardLight keyboardLight, double keyboardWeight) {
        this.keyboardType = keyboardType;
        this.keyboardLight = keyboardLight;
        this.keyboardWeight = keyboardWeight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }
    public KeyboardLight getKeyboardLight() {
        return keyboardLight;
    }
    public double getKeyboardWeight() {
        return keyboardWeight;
    }

    public String toString() {
        return
                "\nТип подключение: " + getKeyboardType() +
                "\nПодсветка клавиатуры: " + getKeyboardLight();
    }
}
