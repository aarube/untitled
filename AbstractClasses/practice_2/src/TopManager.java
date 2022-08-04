package src;

public class TopManager implements Employee {

    public TopManager() {
        getPosition();
        getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        int REQUIREMENT = 10_000_000;
        if (Company.getIncome() > REQUIREMENT) {
            double PERCENT_BONUS = 1.5;
            return (int) (FIX_SALARY + (FIX_SALARY * PERCENT_BONUS));
        } else {
            return FIX_SALARY;
        }
    }

    @Override
    public void getPosition() {
    }

    @Override
    public String getToString() {
        return null;
    }
}