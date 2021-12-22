public class Arithmetic {
    private int first = 0;
    private int second = 0;

    public Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void getPlus(int plus, int first, int second) {
        plus = first + second;
        return;
    }

    public void getMultiply(int multiply, int first, int second) {
        multiply = first * second;
    }

    public void getMax(int max, int first, int second) {
        if (first > second) {
            max = first;
            return;
        } else {
            max = second;
            return;
        }
    }

    public void getMin(int min, int first, int second){
        if (first < second) {
            min = first;
            return;
        } else {
            min = second;
            return;
        }
    }
}
