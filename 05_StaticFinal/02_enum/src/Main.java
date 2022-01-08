public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator first = new ArithmeticCalculator(8,90);
        first.calculate(Operation.ADD);
        System.out.println(first.getResults());
    }
}
