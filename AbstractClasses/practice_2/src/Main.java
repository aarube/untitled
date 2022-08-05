package src;

public class Main {
    public static void main(String[] args) {
        Company mts = new Company();

        mts.hireAll("Manager", 80);
        mts.hireAll("Operator", 180);
        mts.hireAll("TopManager", 10);

        System.out.println(mts.getIncome());

        for (Employee item : mts.employees) {
            if (item.getClass().getName().contains("Manager")) {
                System.out.println(item.getMonthSalary(mts.getIncome()));
            }
        }
    }
}
