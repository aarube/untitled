public class ArithmeticCalculator {
    private static double a;
    private static double b;
    public double results;


    public ArithmeticCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation type) {
        switch (type) {
            case MULTIPLY -> results = a * b;
            case ADD -> results = a + b;
            case SUBTRACT -> results = a - b;
            }
    }

    public double getResults() {
        return results;
    }

}
