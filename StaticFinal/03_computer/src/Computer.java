public class Computer {

    private final String vendor;
    private final String nameComputer;

    private static CPU cpu;
    private static HDD hdd;
    private static RAM ram;
    private static Screen screen;
    private static Keyboard keyboard;

    public Computer(String vendor, String nameComputer) {
        this.vendor = vendor;
        this.nameComputer = nameComputer;
    }

    public static void setCpu(CPU cpu) {
        Computer.cpu = cpu;
    }

    public static void setHdd(HDD hdd) {
        Computer.hdd = hdd;
    }

    public static void setRam(RAM ram) {
        Computer.ram = ram;
    }

    public static void setScreen(Screen screen) {
        Computer.screen = screen;
    }

    public static void setKeyboard(Keyboard keyboard) {
        Computer.keyboard = keyboard;
    }

    public static double getTotalWeight() {
        return  cpu.getCpuWeight()+
                hdd.getHddWeight() +
                ram.getRamWeight() +
                keyboard.getKeyboardWeight() +
                screen.getScreenWeight();
    }

    public String toString() {
        return "Название компьютера"+ nameComputer +
                "\nПроизводитель" + vendor +
                "\n\nТип используемого процессора:\n" + cpu.toString() +
                "\n\nТип оперативной памяти: " + ram.toString() +
                "\n\nТип(ы) постоянного накопителя: " +
                "\nНазвание(я)" + hdd.toString() +
                "\n\nТип используемого монитора: " + screen.toString() +
                "\n\nТип клавиатуры: " + keyboard.toString();

    }
}
