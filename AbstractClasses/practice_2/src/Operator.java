package src;

public class Operator implements Employee {
    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }

    @Override
    public void getPosition() {
    }

    @Override
    public String getToString() {
        return getClass().getName() + ": " + FIX_SALARY;
    }
}