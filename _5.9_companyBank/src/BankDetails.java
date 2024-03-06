public class BankDetails {
    private String billNumber;
    private String bikNumber;
    private String bankName;
    private String city;

    public BankDetails(String bikNumber, String bankName, String city, String billNumber) {
        this.bikNumber = bikNumber;
        this.bankName = bankName;
        this.city = city;
        this.billNumber = billNumber;
    }

    public BankDetails setBillNumber(String billNumber){
        return new BankDetails(billNumber);
    }
    //getters + setters + constructor


    public String getBillNumber() {
        return billNumber;
    }

    public String getCorrespondenceBill() {
        return correspondenceBill;
    }

    public String getBikNumber() {
        return bikNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCity() {
        return city;
    }

    private String correspondenceBill;




    public void setBikNumber(String bikNumber) {
        this.bikNumber = bikNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String toString() {
        return "счёт: " + billNumber + "\n" +
                "к/с: " + correspondenceBill + "\n"
                +
                "БИК: " + bikNumber + "\n" +
                "в " + bankName + " (" + city + ")";
    }
}
