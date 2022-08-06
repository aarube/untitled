package src;

public interface Employee {
    int FIX_SALARY = 26732;
    int getMonthSalary();
    int getManagerIncome();
    default int compareTo(Employee e) {
        return 0;
    }

    String getToString();
}
