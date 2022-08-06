package src;
public class TopManager implements Employee {
    Company company;
    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10_000_000) {
            return (int) (FIX_SALARY + (FIX_SALARY * 1.5));
        } else {
            return FIX_SALARY;
        }
    }

    @Override
    public int getManagerIncome() {
        return 0;
    }

    @Override
    public String getToString() {
        return null;
    }
}