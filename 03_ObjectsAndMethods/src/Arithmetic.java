public class Arithmetic {

    int first;
    int second;

    public Arithmetic() {
        first = 10;
        second = 20;
    }

    public int getPlus() {
        return first + second;
    }

    public int getMultiply() {
        return first * second;
    }

    public int getMax() {
        if (first > second) {
            return first;
        }

        return second;
    }

    public int getMin() {
        if (first < second) {
            return first;
        }

        return second;
    }
}
