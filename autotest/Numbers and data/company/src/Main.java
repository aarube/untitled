import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company zavarka = new Company();
        List<Employee> worker = new ArrayList<>();

        for (int i = 0; i < 80; i++) {
            zavarka.hire(new Operator());
        }
        for(int i = 0; i < 180; i++) {
            worker.add(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            worker.add(new TopManager(zavarka));
        }
        zavarka.hireAll(worker);

        System.out.println("worker.size" + worker.size());

        List<Employee> topSalaryStuff = zavarka.getTopSalaryStaff(15);
        for(Employee e : topSalaryStuff) {
            System.out.println(e.getMonthSalary());
        }

        System.out.println("_________________________________________________________\n");

        List<Employee> lowestSalaryStuff = zavarka.getTopSalaryStaff(15);
        for(Employee e : lowestSalaryStuff) {
            System.out.println(e.getMonthSalary());
        }
    }
}
