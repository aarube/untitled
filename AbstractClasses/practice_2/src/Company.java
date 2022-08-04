package src;

import java.util.ArrayList;
import java.util.Collection;

public class Company {
    public void hire(Employee employee) {
        Manager first = new Manager();
        Manager second = new Manager();
    }

    public void hireAll(Collection<Employee> employes) {

    }

    public void fire(Employee employee) {

    }

    public static int getIncome() {
        return 0;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        return null;
    }

    public void getCompanyStaff(ArrayList<Manager> companyStaff) {

    }
}

class Manager implements Employee {
    private final double percent = 0.005;
    private final double BONUS = 25000;
    private final double MIN_INCOME = 115000;

    public Manager() {
        getPosition();
        getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        return (int) (FIX_SALARY + (int) ((Math.random() * (BONUS)) + MIN_INCOME) * percent);
    }

    // @Override
    public String getPosition() {
        return getClass().getName();
    }

    //@Override
    public String getToString() {
        return getClass().getName() + ": " + getMonthSalary();
    }
}

class TopManager implements Employee {
    private final int REQUIREMENT = 10_000_000;
    private final double PERCENT_BONUS = 1.5;

    public TopManager() {
        getPosition();
        getMonthSalary();
    }

    @Override
    public int getMonthSalary() {
        if (Company.getIncome() > REQUIREMENT) {
            return (int) (FIX_SALARY + (FIX_SALARY * PERCENT_BONUS));
        } else {
            return FIX_SALARY;
        }
    }

    @Override
    public String getPosition() {
        return getClass().getName();
    }

}

class Operator implements Employee {
    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }

    @Override
    public String getPosition() {
        return getClass().getName();
    }
}
