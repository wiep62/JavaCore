public class Main {
    public static void main(String[] args) {

        BankDetails detalis = new BankDetails();
        detalis.setBillNumber("72482428924729742");
        Company company = new Company("Смарт-экспресс", detalis);

        detalis.setBillNumber("23232310000");

        //полное копирование:

        BankDetails copy = new BankDetails(
                detalis.getBillNumber(),
                detalis.getCorrespondenceBill(),
                detalis.getBikNumber(),
                detalis.getCity());

    }
}