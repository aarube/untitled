package src;

public class Operator implements Employee {
    public int getMonthSalary() {
        return FIX_SALARY;
    }

    @Override
    public int getManagerIncome() {
        return 0;
    }

    @Override
    public String getToString() {
        return "Operator" + ": " + getMonthSalary();
    }

}