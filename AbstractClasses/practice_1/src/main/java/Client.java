public abstract class Client {
    private double money = 0.00;

    public double getAmount() {
        return money;
    }

    public void put(double amount) {
        if (amount > 0) {
            money += amount;
        }
    }

    public void take(double amount) {
        if (money > amount) {
            money -= amount;
        }
    }

    public abstract void getName();
}
