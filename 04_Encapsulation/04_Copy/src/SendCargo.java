public class SendCargo {
    private final int weight;
    private final String address;

    private final String registrationNumber;

    private final boolean turnOver;
    private final boolean fragile;

    public SendCargo(String address, int weight, String registrationNumber, boolean turnOver,
                     boolean fragile) {
        this.address = address;
        this.weight = weight;
        this.registrationNumber = registrationNumber;
        this.turnOver = turnOver;
        this.fragile = fragile;
    }

    public SendCargo setAddress(String address) {
        return new SendCargo(address, weight, registrationNumber,turnOver,fragile);
    }

    public SendCargo setWeight(int weight) {
        return new SendCargo(address, weight, registrationNumber,turnOver,fragile);
    }

    public SendCargo setFragile(boolean fragile) {
        return new SendCargo(address, weight, registrationNumber,turnOver,fragile);
    }

    public SendCargo setTurnOver(boolean turnOver) {
        return new SendCargo(address, weight, registrationNumber,turnOver,fragile);
    }

    public SendCargo setRegistrationNumber(String registrationNumber) {
        return new SendCargo(address, weight, registrationNumber,turnOver,fragile);
    }
}
