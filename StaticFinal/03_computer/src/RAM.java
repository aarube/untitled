public class RAM {

    private final RamType ramType;

    private final double volumeRam;

    private final double ramWeight;

    public RAM(RamType ramType, double volumeRam, double ramWeight) {
        this.ramType = ramType;
        this.volumeRam = volumeRam;
        this.ramWeight = ramWeight;
    }

    public RamType getRamType() {
        return ramType;
    }

    public double getVolumeRam() {
        return volumeRam;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    public String toString() {
        return "\nТип: " + getRamType() +
                "\nОбъем оепративной памяти: " + getVolumeRam() + " Гб.";
    }
}
