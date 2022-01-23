public class CPU {

    private final double frequency;

    private final double countCores;

    private final VendorCpu vendorCpu;

    private final double cpuWeight;

    public CPU(double frequency, double countCores, VendorCpu vendorCpu, double cpuWeight) {
        this.frequency = frequency;
        this.countCores = countCores;
        this.vendorCpu = vendorCpu;
        this.cpuWeight = cpuWeight;
    }

    public  double getFrequency() {
        return frequency;
    }

    public double getCountCores() {
        return countCores;
    }

    public VendorCpu getVendorCpu() {
        return vendorCpu;
    }

    public double getCpuWeight() {
        return cpuWeight;
    }

    public String toString() {
        return
                "\nТактовая частота процессора: " + getFrequency() + " Ггц." +
                "\nКолличество ядер процессора: " + getCountCores() + " шт." +
                "\nПроизводитель: " + getVendorCpu();
    }
}
