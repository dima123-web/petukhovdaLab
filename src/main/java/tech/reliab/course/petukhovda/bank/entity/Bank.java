package tech.reliab.course.petukhovda.bank.entity;

public class Bank {
    private int bankId;
    private String name;
    private int countOffices;
    private int countAtms;
    private int countEmployees;
    private int countClients;
    private int rating;
    private double totalMoney;
    private double interestRate;

    public Bank() {
        this.rating = (int) (Math.random() * 101);
        this.totalMoney = Math.random() * 1_000_001;
        this.interestRate = Math.random() * (20 - (rating / 5)) + 1;
    }

    public Bank(int id, String name) {
        this.bankId = id;
        this.name = name;
        this.rating = (int) (Math.random() * 101); // генерация рейтинга
        this.totalMoney = Math.random() * 1_000_001; // генерация денег в банке
        this.interestRate = Math.random() * (20 - (rating / 5)) + 1; // генерация процентной ставки с учетом рейтинга
    }

    // Getters
    public int getBankId() { return bankId; }

    public String getName() { return name; }

    public int getCountOffices() { return countOffices; }

    public int getCountAtms() { return countAtms; }

    public int getCountEmployees() { return countEmployees; }

    public int getCountClients() { return countClients; }

    public int getRating() { return rating; }

    public double getTotalMoney() { return totalMoney; }

    public double getInterestRate() { return interestRate; }

    // Setters
    public void setBankId(int bankId) { this.bankId = bankId; }

    public void setName(String name) { this.name = name; }

    public void setRating(int rating) {
        if (rating > 0 && rating <= 100)
            this.rating = rating;
    }

    public void setTotalMoney(double totalMoney) {
        if (totalMoney > 0 && totalMoney <= 1_000_000)
            this.totalMoney = totalMoney;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate > 0 && interestRate <= 20)
            this.interestRate = interestRate;
    }

    // для автоматического добавления
    public void addCountOffices() { this.countOffices++; }

    public void addCountAtms() { this.countAtms++; }

    public void addCountEmployees() { this.countEmployees++; }

    public void addCountClients() { this.countClients++;}

    @Override
    public String toString() {
        return String.format("Bank:\nid: %d; name: %s; countOffices: %d; countAtms: %d; " +
                "countEmployees: %d; countClients: %d; rating: %d; totalMoney: %f; interestRate: %f",
                bankId, name, countOffices, countAtms, countEmployees, countClients, rating, totalMoney, interestRate);
    }

}
