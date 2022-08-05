package src;

public class Manager implements Employee {

//    public Manager() {
//        getPosition();
//        getMonthSalary();
//    }

    public int getManagerIncome() {
        return (int) ((Math.random() * (25000)) + 115000);
    }

    public int getMonthSalary() {
        return (int) (FIX_SALARY + getManagerIncome() * 0.05);
    }


    @Override
    public String getToString() {
        return getClass().getName() + ": " + getMonthSalary();
    }

    public int getManagerSalary() {
        return getMonthSalary();
    }
}
