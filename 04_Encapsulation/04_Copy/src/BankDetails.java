public class BankDetails {
    private final String billNumber;
    private final String correspondentBill;
    private final String bikNumber;
    private final String bankName;
    private final String city;

    public BankDetails(String billNumber,
                       String correspondentBill,
                       String bikNumber,
                       String bankName,
                       String city) {
        this.billNumber = billNumber;
        this.correspondentBill = correspondentBill;
        this.bikNumber = bikNumber;
        this.bankName = bankName;
        this.city = city;
    }

    public BankDetails() {
        billNumber = "N/A";
        correspondentBill = "N/A";
        bikNumber = "N/A";
        bankName = "N/A";
        city = "N/A";
    }

    public String getBillNumber() {
        return billNumber;
    }

    public BankDetails setBillNumber(String billNumber) {
        return new BankDetails(billNumber, correspondentBill, bikNumber, bankName,city);
    }

    public String getCorrespondentBill() {
        return correspondentBill;
    }

    public BankDetails setCorrespondentBill(String correspondentBill) {
        return new BankDetails(billNumber, correspondentBill, bikNumber, bankName,city);
    }

    public String getBikNumber() {
        return bikNumber;
    }

    public BankDetails setBikNumber(String bikNumber) {
        return new BankDetails(billNumber, correspondentBill, bikNumber, bankName,city);
    }

    public String getBankName() {
        return bankName;
    }

    public BankDetails setBankName(String bankName) {
        return new BankDetails(billNumber, correspondentBill, bikNumber, bankName,city);
    }

    public String getCity() {
        return city;
    }

    public BankDetails setCity(String city) {
        return new BankDetails(billNumber, correspondentBill, bikNumber, bankName,city);
    }

    public String toString() {
        return "Счет: " + billNumber + "\n" +
                "K/C " + correspondentBill + "\n" +
                "БИК " + bikNumber + "\n" +
                "в " + bankName + " (" + bankName + "). ";
    }
}
