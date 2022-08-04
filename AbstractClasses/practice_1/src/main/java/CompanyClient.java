public class CompanyClient extends Client {
    private final double percentTakeBefore = 1.01;
    @Override
    public void getName() {
        System.out.println("Company Client");
    }

    @Override
    public void take(double amount) {
        amount *= percentTakeBefore;
        if (amount <= super.getAmount()) {
            super.take(amount);
        }
    }
}