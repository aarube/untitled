public class HDD {

    private final double memoryVolume;

    private final HddType hddType;

    private final double HddWeight;

    public HDD(double memoryVolume, HddType hddType, double hddWeight) {
        this.memoryVolume = memoryVolume;
        this.hddType = hddType;
        HddWeight = hddWeight;
    }

    public double getMemoryVolume() {
        return memoryVolume;
    }

    public HddType getHddType() {
        return hddType;
    }

    public double getHddWeight() {
        return HddWeight;
    }

    public String toString() {
        return
                "\nТип накопителя: "+ getHddType() +
                "\nОбщий объем памяти: " + getMemoryVolume() + " Гб.";
    }
}
