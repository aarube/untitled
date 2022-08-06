package src;

public class Main {
    public static void main(String[] args) {
        Company mts = new Company();

        int topManagerSalary = 0;
        int managerSalary = 0;

        Employee operator =     new Operator();
        Employee manager =      new Manager();
        Employee topManager =   new TopManager(mts);

        mts.hireAll(manager,    80);
        mts.hireAll(operator,   180);
        mts.hireAll(topManager, 10);

        for (Employee item : mts.employees) {
            if (item instanceof TopManager) {
                int a = item.getMonthSalary();
                topManagerSalary = topManagerSalary + a;
            }
        }

        for (Employee item : mts.employees) {
            if (item instanceof Manager) {
                managerSalary += item.getMonthSalary();
            }
        }



    }
}
