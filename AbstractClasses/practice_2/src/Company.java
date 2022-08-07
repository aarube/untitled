package src;

import java.util.ArrayList;
public class Company {

    public ArrayList<Employee> employees = new ArrayList<>();

    public int getIncome() {
        int a = 0;
        for (Employee item : employees) {
            if (item instanceof Manager) {
                a += item.getManagerIncome();
            }
        }
        return a;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Employee employee, int count) {
        for (int i = 0; i < count; i++) {
            employees.add(employee);
        }
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public void fireAll(int count) {
        if (count > 0 && count < employees.size()) {
            for (int i = 0; i < count; i++) {
                employees.remove(i);
            }
        }
    }

    public ArrayList<Employee> getLowestSalaryStaff ( int count ){

        if (count > 0 && count < employees.size()) {
            employees.sort(new EmployeeComparator());
            System.out.println(count + " lowest salary ");
            int i = 0;

            for (Employee item : employees) {
                if (i < count) {
                    System.out.println(item.getToString());
                    i++;
                }
            }
        }
        return null;
    }

    public ArrayList<Employee> getTopSalaryStaff ( int count ){

        if (count > 0 && count < employees.size()) {
            employees.sort(new EmployeeComparator().reversed());
            System.out.println(+count + " top salary:");
            int i = 0;

            for (Employee employee : employees) {
                if (i < count) {
                    System.out.println(employee.getToString());
                    i++;
                }
            }
        }
        return null;
    }

}
