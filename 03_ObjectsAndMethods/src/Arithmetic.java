public class Arithmetic {
    private int first = 90;
    private int second = 50;

    public Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static void getPlus(int first, int second) {
        int plus;
        plus = first + second;
        return;
    }

    public void getMultiply(int first, int second) {
        int multiply;
        multiply = first * second;
    }

    public void getMax(int first, int second) {
        int max;
        if (first > second) {
            max = first;
            return;
        } else {
            max = second;
            return;
        }
    }

    public void getMin(int first, int second){
        int min;
        if (first < second) {
            min = first;
            return;
        } else {
            min = second;
            return;
        }
    }
}
