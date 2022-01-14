public class Computer {

    private static double frequencyCpu;
    private static double numberOfCoresCpu;
    private static String vendorCpu;
    private static double weightCpu;

    private static double amountRam;
    private static String typeUseRam;
    private static double ramWeight;

    private static String typeUseHardDrive;
    private static double hardDriveMemory;
    private static double hardDriveWeight;

    private static double monitorDiagonal;
    private static String typeUseMonitor;
    private static double monitorWeight;

    private static String typeUseKeyboard;
    private static String keyLight;
    private static double keyboardWeight;

    private final String vendor;
    private final String nameComputer;

    private static Cpu typeCpu;
    private static Ram typeRam;
    private static Hdd typeHdd;
    private static Monitor  typeMonitor;
    private static Keyboard typeKeyboard;


    public Computer(String vendor, String nameComputer) {
        this.vendor = vendor;
        this.nameComputer = nameComputer;
    }

    public void setCpu(Cpu typeCpu) {
        this.typeCpu = typeCpu;
        if (typeCpu == Cpu.INTEL_CORE_I9_10900F_LGA_1200_OEM) {
            frequencyCpu = 2.8;
            numberOfCoresCpu = 10;
            vendorCpu = "Intel";
            weightCpu = 0.220;
        }

        if (typeCpu == Cpu.AMD_RYZEN_9_5900X_SOCKET_AM4) {
            frequencyCpu = 3.7;
            numberOfCoresCpu = 12;
            vendorCpu = "AMD";
            weightCpu = 0.270;
        }
    }

    public void setRam(Ram typeRam) {
        this.typeRam = typeRam;
        if (typeRam == Ram.CORSAIR_DOMINATOR_PLATINUM_RGB_CMT32GX5M2X5600C36_DDR5_2x_16ГБ) {
            amountRam = 32;
            typeUseRam = "DDR5";
            ramWeight = 0.300;
        }
        if (typeRam == Ram.CRUCIAL_CT2K32G48C40U5_DDR5_2X_32ГБ_4800) {
            amountRam = 64;
            typeUseRam = "DDR5";
            ramWeight = 0.400;
        }

    }

    public void setHardDrive(Hdd typeHdd) {
        this.typeHdd = typeHdd;
        if (typeHdd == Hdd.WD_PURPLE_PRO_WD181PURP_AND_SSD_INTEL_OPTANE_DC_P5800X_SSDPF21Q400GB01_400ГБ) {
            typeUseHardDrive = "HDD18Tb + SSD 400Gb";
            hardDriveMemory = 18432 + 400; //Gb
            hardDriveWeight = 0.350 + 1.300;
        }
    }

    public void setMonitor(Monitor typeMonitor) {
        this.typeMonitor = typeMonitor;
        if (typeMonitor == Monitor.DELL_ULTRASHARP_UP3221Q_31_BLACK) {
            monitorDiagonal = 31.5;
            typeUseMonitor = "IPS";
            monitorWeight = 18.07;
        }

        if (typeMonitor == Monitor.SAMSUNG_S49AG950NI_49) {
            monitorDiagonal = 49;
            typeUseMonitor = "VA";
            monitorWeight = 14.5;
        }
    }

    public void setKeyboard(Keyboard typeKeyboard) {
        this.typeKeyboard = typeKeyboard;

        if (typeKeyboard == Keyboard.LOGITECH_G915) {
            typeUseKeyboard = "Bluetooth";
            keyLight = "Yes";
            keyboardWeight = 0.650;
        }

        if (typeKeyboard == Keyboard.LOGITECH_K860) {
            typeUseKeyboard = "Bluetooth";
            keyLight = "No";
            keyboardWeight = 0.550;
        }
    }

    public double getTotalWeight() {
        return keyboardWeight + monitorWeight + hardDriveWeight + ramWeight + weightCpu;
    }

    public Cpu getCpuType() {
        return typeCpu;
    }

    public Hdd getHddType() {
        return typeHdd;
    }

    public Keyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public Ram getTypeRam() {
        return typeRam;
    }

    public Monitor getTypeMonitor() {
        return typeMonitor;
    }

    public String toString () {
        return "Тип используемого процессора:" +
                "\nНазвание: " + getCpuType() +
                "\nТактовая частота процессора: " + frequencyCpu + " Ггц." +
                "\nКолличество ядер процессора: " + numberOfCoresCpu + " шт."+
                "\nПроизводитель: " + vendorCpu +
                "\n\nТип используемой памяти: " +
                "\nНазвание: " + getTypeRam() +
                "\nТип: " + typeUseRam +
                "\nОбъем памяти: " + amountRam + " Гб." +
                "\n\nТип(ы) используемой постоянной памяти: " +
                "\nНазвание(я)"+getHddType() +
                "\nОбщий объем памяти: " + hardDriveMemory + " Гб." +
                "\n\nТип используемого монитора: " +
                "\nНазвание: " + getTypeMonitor() +
                "\nТип матрицы: " + typeUseMonitor +
                "\nДиагональ: "+ monitorDiagonal + " Дюйм." +
                "\n\nТип клавиатуры: " +
                "\nНазвание: " + getTypeKeyboard() +
                "\nТип подключение: " + typeUseKeyboard +
                "\nПодсветка клавиатуры: "+ keyLight;
    }


}

