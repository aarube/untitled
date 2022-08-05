package src;
public class TopManager implements Employee {

//    public TopManager() {
//        getPosition();
//        getMonthSalary();
//    }

    @Override
    public int getMonthSalary() {
        int REQUIREMENT = 10_000_000;
        if (income > REQUIREMENT) {
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
        return getClass().getName()+": "+ getMonthSalary();
    }
}