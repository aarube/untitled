package src;
public class Manager implements Employee {

    @Override
    public int getManagerIncome() {
        return (int) ((Math.random() * (25_000)) + 115_000);
    }

    public int getMonthSalary() {
        return (int) (FIX_SALARY + getManagerIncome() * 0.09);
    }

    @Override
    public String getToString() {

        return "Manager" + ": " + getMonthSalary();
    }
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return 0;
//    }
}
