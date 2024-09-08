package tech.reliab.course.petukhovda.bank.entity;

public class BankAtm {
    private int bankAtmId;
    private String name;
    private String address;
    private String status;
    private Bank bank;
    private BankOffice location;
    private Employee servicingEmployee;
    private boolean isIssuingMoney;
    private boolean isDepositingMoney;
    private double amountOfMoney;
    private double servicingCost;

    public BankAtm() {}

    public BankAtm(int id, String name, String status,
                   Bank bank, BankOffice location, Employee servicingEmployee,
                   boolean isIssuingMoney, boolean isDepositingMoney,
                   double amountOfMoney, double servicingCost) {
        this.bankAtmId = id;
        this.name = name;
        this.address = location.getAddress();
        this.status = status;
        this.bank = bank;
        bank.addCountAtms();
        this.location = location;
        location.addCountOfAtms();
        this.servicingEmployee = servicingEmployee;
        this.isIssuingMoney = isIssuingMoney;
        this.isDepositingMoney = isDepositingMoney;
        if (bank.getTotalMoney() > amountOfMoney)
            this.amountOfMoney = amountOfMoney;
        this.servicingCost = servicingCost;
    }

    // Getters
    public int getId() { return bankAtmId; }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public String getStatus() { return status; }

    public Bank getBank() { return bank; }

    public BankOffice getLocation() { return location; }

    public Employee getServicingEmployee() { return servicingEmployee; }

    public boolean isIssuingMoney() { return isIssuingMoney; }

    public boolean isDepositingMoney() { return isDepositingMoney; }

    public double getAmountOfMoney() { return amountOfMoney; }

    public double getServicingCost() { return servicingCost; }


    // Setters


    public void setBankAtmId(int bankAtmId) { this.bankAtmId = bankAtmId; }

    public void setName(String name) { this.name = name; }

    public void setAddress(String address) { this.address = address; }

    public void setBank(Bank bank) { this.bank = bank; }

    public void setLocation(BankOffice location) { this.location = location; }

    public void setServicingEmployee(Employee servicingEmployee) {
        this.servicingEmployee = servicingEmployee;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        if (bank.getTotalMoney() > amountOfMoney)
            this.amountOfMoney = amountOfMoney;
    }

    public void setServicingCost(double servicingCost) {
        this.servicingCost = servicingCost;
    }

    public void setStatus(String status) { this.status = status; }

    public void setIssuingMoney(boolean isIssuingMoney) {
        this.isIssuingMoney = isIssuingMoney;
    }

    public void setDepositingMoney(boolean isDepositingMoney) {
        this.isDepositingMoney = isDepositingMoney;
    }

    @Override
    public String toString() {
        return "BankAtm{" +
                "bankAtmId=" + bankAtmId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", bank=" + bank +
                ", location=" + location +
                ", servicingEmployee=" + servicingEmployee +
                ", isIssuingMoney=" + isIssuingMoney +
                ", isDepositingMoney=" + isDepositingMoney +
                ", amountOfMoney=" + amountOfMoney +
                ", servicingCost=" + servicingCost +
                '}';
    }
}

