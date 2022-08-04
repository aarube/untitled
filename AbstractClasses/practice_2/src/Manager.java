package src;

public class Manager implements Employee {

    public Manager() {
        getPosition();
        getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        return (int) (FIX_SALARY + (int) ((Math.random() * (25000)) + 115000) * 0.005);
    }

    @Override
    public void getPosition() {
    }

    @Override
    public String getToString() {
        return getClass().getName() + ": " + getMonthSalary();
    }
}
