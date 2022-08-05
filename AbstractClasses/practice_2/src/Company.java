package src;

import java.util.ArrayList;
public class Company {
    public ArrayList<Employee> employees = new ArrayList<>();

    public int getIncome() {
        int a = 0;
        for (Employee item : employees) {
            if (item.getClass().getName().contains("Manager")) {
                a += item.getManagerIncome();
            }
        }
        return a;
    }

    public void hire(String position) {
        getSwitchToHire(position);
    }
    public void hireAll(String position, int count) {
        for (int i = 0; i < count; i++) {
            getSwitchToHire(position);
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

    public void getSwitchToHire(String position) {
        switch (position) {
            case "Operator" -> employees.add(new Operator());
            case "Manager" -> employees.add(new Manager());
            case "TopManager" -> employees.add(new TopManager());
        }
    }
}
