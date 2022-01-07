public class ArithmeticCalculator {
    private static int a;
    private static int b;

    public Operation type;


    public ArithmeticCalculator(int a, int b, Operation type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }

    public int calculate() {
        return a*b;
    }
}
