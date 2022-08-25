public interface Employee extends Comparable<Employee> { //Comparable
    int FIX_SALARY = 26732;
    int getMonthSalary();
    //Comparable:
    @Override
    default int compareTo(Employee o) {
        return Integer.compare(getMonthSalary(),o.getMonthSalary() );
    }
}
