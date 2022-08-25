package src;
import java.util.Comparator;

public interface Employee {//extends Comparator<Employee> {
    int FIX_SALARY = 26732;
    int getMonthSalary();
    int getManagerIncome();
    String getToString();

//    default int compareTo(Employee o1, Employee o2) {
//        if (o1.getMonthSalary() > o2.getMonthSalary()) {
//            return 1;
//        }
//        if (o1.getMonthSalary() < o2.getMonthSalary()) {
//            return -1;
//        }
//        return 0;
//    }
}
