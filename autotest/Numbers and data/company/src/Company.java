import java.util.*;

public class Company implements Comparator<Employee>{ //Comparator
    List<Employee> employees = new ArrayList<>();


    public List<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employees); //Comparable - Default logic
        Collections.reverse(employees);
        return employees.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        employees.sort(this); //Comparator - Use it for objects, which require unique logic

        return employees.subList(0,count);
    }

    public void hire(Employee e) {
        employees.add(e);
    }

    public void  hireAll(List<Employee> e) {
        for (Employee item: e) {
            hire(item);
        }
    }

    public void fire(Employee e) {
        employees.remove(e);
    }

    public int getIncome() {
        int income = 0;
        for (Employee item : employees)
        if (item instanceof Manager) {
        }
        return income;
    }

//Comparator:
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getMonthSalary(),o2.getMonthSalary());
    }
}