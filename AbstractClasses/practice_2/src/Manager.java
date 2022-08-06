package src;

public class Manager implements Employee {

    @Override
    public int getManagerIncome() {
        return (int) ((Math.random() * (25_000)) + 115_000);
    }

    @Override
    public String getToString() {
        return null;
    }

    public int getMonthSalary() {
        return (int) (FIX_SALARY + getManagerIncome() * 0.05);
    }
}
