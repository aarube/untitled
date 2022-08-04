package src;

import java.util.ArrayList;

public class Company {

    public ArrayList<Employee> employees = new ArrayList<>();
    public static double income;
    public String name;

    public void setIncome(double income) {
        Company.income = income;
    }

    public static double getIncome() {
        return income;
    }

    public Company(String name, double income) {
        this.name = name;
        Company.income = income;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee.getToString());
        }
    }


    public void hireAll(String position, int count) {
        for (int i = 0; i < count; i++) {
            switch (position) {
                case "Operator" -> employees.add(new Operator());
                case "Manager" -> employees.add(new Manager());
                case "TopManager" -> employees.add(new TopManager());
            }
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


    public void getTopSalaryStaff(int count) {
        if (count > 0 && count < employees.size()) {
            employees.sort(new EmployeeComparator().reversed());
            System.out.println(count + " top salary:");
            int i = 0;
            for (Employee employee : employees) {
                if (i < count) {
                    System.out.println(employee.getToString());
                    i++;
                }
            }
        }
    }


    public void getLowestSalaryStaff(int count) {
        if (count > 0 && count < employees.size()) {
            employees.sort(new EmployeeComparator());
            System.out.println(count + " lowest salary ");
            int i = 0;
            for (Employee employee : employees) {
                if (i < count) {
                    System.out.println(employee.getToString());
                    i++;
                }
            }
        }
    }
}
