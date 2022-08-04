public class IndividualEntrepreneurClient extends PhysicalPersonClient {

    private final double percentTakeBefore = 0.99;
    private final double percentTakeAfter = 0.995;
    private final double borderAmount = 1000;

    @Override
    public void getName() {
        System.out.println("Individual Entrepreneur Client");
    }

    @Override
    public void put(double amount) {
        if (amount >= borderAmount) {
            super.put(amount * percentTakeAfter);
        }
        if (amount < borderAmount && amount > 0) {
            super.put(amount * percentTakeBefore);
        }
    }
}
