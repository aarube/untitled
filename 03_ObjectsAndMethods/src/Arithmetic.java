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

    public static void getMultiply(int first, int second) {
        int multiply;
        multiply = first * second;
    }

    public static void getMax(int first, int second) {
        int max;
        if (first > second) {
            max = first;
        } else {
            max = second;
        }
    }

    public static void getMin(int first, int second){
        int min;
        if (first < second) {
            min = first;
        } else {
            min = second;
            System.out.println(min);
        }
    }
}
