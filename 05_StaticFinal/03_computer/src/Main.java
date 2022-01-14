public class Main {
    public static void main(String[] args){
        Computer My = new Computer("Shop", "Alex");
        My.setCpu(Cpu.AMD_RYZEN_9_5900X_SOCKET_AM4);
        My.setRam(Ram.CRUCIAL_CT2K32G48C40U5_DDR5_2X_32ГБ_4800);
        My.setHardDrive(Hdd.WD_PURPLE_PRO_WD181PURP_AND_SSD_INTEL_OPTANE_DC_P5800X_SSDPF21Q400GB01_400ГБ);
        My.setMonitor(Monitor.SAMSUNG_S49AG950NI_49);
        My.setKeyboard(Keyboard.LOGITECH_G915);

        System.out.println(My.getTotalWeight());
        System.out.println(My.toString());
    }

}
