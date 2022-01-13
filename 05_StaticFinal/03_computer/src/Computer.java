public class Computer {

    private static double frequencyCpu;
    private static double numberOfCoresCpu;
    private static String vendorCpu;
    private static double weightCpu;

    private static double amountRam;
    private static String typeRam;
    private static double weightRam;

    private static String hardDriveType;
    private static double hardDriveMemory;
    private static double hardDriveWeight;

    private static double monitorDiagonal;
    private static String monitorType;
    private static double monitorWeight;

    public static void setCpu(CPU type) {
 //   public Computer(CPU type) {
        if (type == CPU.INTEL_CORE_I9_10900F_LGA_1200_OEM) {
            frequencyCpu = 2.8;
            numberOfCoresCpu = 10;
            vendorCpu = "Intel";
            weightCpu = 0.220;
        }

        if (type == CPU.AMD_RYZEN_9_5900X_SOCKET_AM4) {
            frequencyCpu = 3.7;
            numberOfCoresCpu = 12;
            vendorCpu = "AMD";
            weightCpu = 0.270;
        }
    }

    public void setRam(RAM type) {
        if(type == RAM.CORSAIR_DOMINATOR_PLATINUM_RGB_CMT32GX5M2X5600C36_DDR5_2x_16ГБ) {
            amountRam = 32;
            typeRam = "DDR5";
            weightRam = 0.400;
        }
        if(type == RAM.CRUCIAL_CT2K32G48C40U5_DDR5_2X_32ГБ_4800) {
            amountRam = 64;
            typeRam = "DDR5";
            weightRam = 0.400;
        }

    }

    public void setHardDrive(HDD type) {
        if(type == HDD.WD_PURPLE_PRO_WD181PURP_PLUS_SSD_INTEL_OPTANE_DC_P5800X_SSDPF21Q400GB01_400ГБ) {
            hardDriveType = "HDD18Tb + SSD 400Gb";
            hardDriveMemory = 18432 + 400; //Gb
            hardDriveWeight = 0.350 + 1.300;
        }
    }

    public void setMonitor(MONITOR type) {
        if (type == MONITOR.DELL_ULTRASHARP_UP3221Q_31_BLACK) {
            monitorDiagonal = 31.5;
            monitorType = "IPS";
            monitorWeight = 18.07;
        }

        if (type == MONITOR.SAMSUNG_S49AG950NI_49) {
            monitorDiagonal = 49;
            monitorType = "VA";
            monitorWeight = 14.5;
        }
    }
}

