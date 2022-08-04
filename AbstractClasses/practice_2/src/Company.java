package src;

import java.util.ArrayList;
import java.util.Collection;

public class Company implements Employee{

    public void hire(Employee employee) {
        Manager first = new Manager();
        Manager second = new Manager();
    }

    public void hireAll(Collection<Employee> employes) {

    }

    public void fire(Employee employee) {

    }

    public void getIncome() {

    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        return null;
    }

    public void getCompanyStaff(ArrayList<Manager> companyStaff) {
        
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }
}

class Manager implements Employee {

    double percent = 0.005;
    private double getSumForCompany() {
        return (int)(( Math.random() * (25000) ) + 115000) * 0.005;
    }
    @Override
    public int getMonthSalary() {
        return (int) (monthSalary + getSumForCompany());
    }
}

class TopManager implements Employee{
    @Override
    public int getMonthSalary() {
        return 0;
    }
}

class Operator implements Employee{
    @Override
    public int getMonthSalary() {
        return monthSalary;
    }
}
