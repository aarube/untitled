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

//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return 0;
//    }
}