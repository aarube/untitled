package src;

public class Main {
    public static void main(String[] args) {
        Company mts = new Company();

        Employee operator =     new Operator();
        Employee manager =      new Manager();
        Employee topManager =   new TopManager(mts);

        mts.hireAll(manager,    80);
        mts.hireAll(operator,   180);
        mts.hireAll(topManager, 10);


        mts.getLowestSalaryStaff(20);
        mts.getTopSalaryStaff(20);
        mts.fireAll(135);
        System.out.println("fireAll : 50%");
        mts.getLowestSalaryStaff(20);
        mts.getTopSalaryStaff(20);
    }
}
