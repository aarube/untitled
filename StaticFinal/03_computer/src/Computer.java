public class Computer {

    private final String vendor;
    private final String nameComputer;

    private CPU cpu;
    private HDD hdd;
    private RAM ram;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String nameComputer) {
        this.vendor = vendor;
        this.nameComputer = nameComputer;
    }

    public String getVendor() {
        return vendor;
    }

    public String getNameComputer() {
        return nameComputer;
    }

    public CPU getCpu() {
        return cpu;
    }

    public HDD getHdd() {
        return hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getTotalWeight() {
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
