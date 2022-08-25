public class Operator implements Employee {
    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }
}

class Manager implements Employee {
    int incomeForCompany;
    int salary;

    public Manager() {
        incomeForCompany = (int) (Math.random() * 25000 + 115000);
        salary = (int) (incomeForCompany * 0.05) + FIX_SALARY;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    public int getIncomeForCompany() {
        return incomeForCompany;
    }
}

class TopManager implements Employee {
    Company company;
    public TopManager(Company company) {
        this.company = company;
    }
    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10_000_000)
            return (int) (FIX_SALARY + (FIX_SALARY * 3.5));
        return (int) (FIX_SALARY * 1.5);
    }
}
