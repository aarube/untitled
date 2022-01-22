public class CPU {

    public double frequency;

    private double countCores;

    private VendorCpu vendorCpu;

    private double cpuWeight;


    public double getFrequency() {
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


    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setCountCores(double countCores) {
        this.countCores = countCores;
    }

    public void setVendorCpu(VendorCpu vendorCpu) {
        this.vendorCpu = vendorCpu;
    }

    public void setCpuWeight(double cpuWeight) {
        this.cpuWeight = cpuWeight;
    }

    public String toString() {
        return
                "\nТактовая частота процессора: " + getFrequency() + " Ггц." +
                "\nКолличество ядер процессора: " + getCountCores() + " шт." +
                "\nПроизводитель: " + getVendorCpu();
    }
}
