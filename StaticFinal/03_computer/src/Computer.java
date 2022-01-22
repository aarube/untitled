public class Computer {

    private final String vendor;
    private final String nameComputer;

    private CPU Cpu;

    public Computer(String vendor, String nameComputer) {
        this.vendor = vendor;
        this.nameComputer = nameComputer;
    }

    public void setCpu(CPU cpu) {
        Cpu = cpu;
    }

    public String toString() {
        return "Название компьютера"+ nameComputer +
                "\nПроизводитель" + vendor +
                "\n\nТип используемого процессора:\n" + CPU.toString +
                "\n\nТип используемой памяти: " +
                "\nНазвание: " + getTypeRam() +
                "\nТип: " + typeUseRam +
                "\nОбъем памяти: " + amountRam + " Гб." +
                "\n\nТип(ы) используемой постоянной памяти: " +
                "\nНазвание(я)" + getHddType() +
                "\nОбщий объем памяти: " + hardDriveMemory + " Гб." +
                "\n\nТип используемого монитора: " +
                "\nНазвание: " + getTypeMonitor() +
                "\nТип матрицы: " + typeUseMonitor +
                "\nДиагональ: " + monitorDiagonal + " Дюйм." +
                "\n\nТип клавиатуры: " +
                "\nНазвание: " + getTypeKeyboard() +
                "\nТип подключение: " + typeUseKeyboard +
                "\nПодсветка клавиатуры: " + keyLight;
    }
}
