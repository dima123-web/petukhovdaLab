package tech.reliab.course.petukhovda.bank.entity;

public class BankOffice {
    private int bankOfficeId;
    private Bank bank;
    private String name;
    private String address;
    private String status;
    private boolean canPlaceAtm;
    private int countOfAtms;
    private boolean canIssueLoan;
    private boolean isIssuingMoney;
    private boolean isDepositingMoney;
    private double amountOfMoney;
    private double rentalCost;

    public BankOffice() {}

    public BankOffice(int bankOfficeId, Bank bank, String name, String address, String status,
                      boolean canPlaceAtm, boolean canIssueLoan, boolean isIssuingMoney,
                      boolean isDepositingMoney, double amountOfMoney, double rentalCost) {
        this.bankOfficeId = bankOfficeId;
        this.bank = bank;
        bank.addCountOffices();
        this.name = name;
        this.address = address;
        this.status = status;
        this.canPlaceAtm = canPlaceAtm;
        this.countOfAtms = bank.getCountAtms();
        this.canIssueLoan = canIssueLoan;
        this.isIssuingMoney = isIssuingMoney;
        this.isDepositingMoney = isDepositingMoney;
        if (bank.getTotalMoney() > amountOfMoney)
            this.amountOfMoney = amountOfMoney;
        this.rentalCost = rentalCost;
    }

    // Getters
    public int getBankOfficeId() { return bankOfficeId; }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public String getStatus() { return status; }

    public boolean isCanPlaceAtm() { return canPlaceAtm; }

    public int getCountOfAtms() { return countOfAtms; }

    public boolean isCanIssueLoan() { return canIssueLoan; }

    public boolean isIssuingMoney() { return isIssuingMoney; }

    public boolean isDepositingMoney() { return isDepositingMoney; }

    public double getAmountOfMoney() { return amountOfMoney; }

    public double getRentalCost() { return rentalCost; }

    //Setters


    public void addCountOfAtms() { this.countOfAtms++; }

    public void setBankOfficeId(int bankOfficeId) { this.bankOfficeId = bankOfficeId; }

    public void setBank(Bank bank) { this.bank = bank; }

    public void setName(String name) { this.name = name; }

    public void setAddress(String address) { this.address = address; }

    public void setStatus(String status) { this.status = status; }

    public void setCanPlaceAtm(boolean canPlaceAtm) { this.canPlaceAtm = canPlaceAtm; }

    public void setCanIssueLoan(boolean canIssueLoan) { this.canIssueLoan = canIssueLoan; }

    public void setIssuingMoney(boolean issuingMoney) { isIssuingMoney = issuingMoney; }

    public void setDepositingMoney(boolean depositingMoney) { isDepositingMoney = depositingMoney; }

    public void setAmountOfMoney(double amountOfMoney) {
        if (bank.getTotalMoney() > amountOfMoney)
            this.amountOfMoney = amountOfMoney;
    }

    public void setRentalCost(double rentalCost) { this.rentalCost = rentalCost; }

    @Override
    public String toString() {
        return String.format("BankOffice:\nBankOfficeId: %d; name: %s; address: %s; status: %s; " +
                        "canPlaceAtm: %b; countOfAtms: %d; canIssueLoan: %b; isIssuingMoney: %b;" +
                        " isDepositingMoney: %b, amountOfMoney: %f; rentalCost: %f;",
                bankOfficeId, name, address, status, canPlaceAtm, countOfAtms, canIssueLoan,
                isIssuingMoney, isDepositingMoney, amountOfMoney, rentalCost);
    }

}
