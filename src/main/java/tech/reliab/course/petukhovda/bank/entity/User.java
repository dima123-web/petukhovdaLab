package tech.reliab.course.petukhovda.bank.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String fullName;
    private LocalDate birthDate;
    private String workplace;
    private double monthlyIncome;
    private List<Bank> banks;
    private List<CreditAccount> creditAccounts;
    private List<PaymentAccount> paymentAccounts;
    private int creditRating;

    public User(int id, String fullName, LocalDate birthDate, String workplace) {
        this.userId = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.workplace = workplace;
        this.monthlyIncome = Math.random() * 10_000;
        this.banks = new ArrayList<>();
        this.creditAccounts = new ArrayList<>();
        this.paymentAccounts = new ArrayList<>();
        this.creditRating = (int) (this.monthlyIncome / 1000) * 100;
    }

    public int getUserId() { return userId; }

    public String getFullName() { return fullName; }

    public LocalDate getBirthDate() { return birthDate; }

    public String getWorkplace() { return workplace; }

    public double getMonthlyIncome() { return monthlyIncome; }

    public List<Bank> getBanks() { return banks; }

    public List<CreditAccount> getCreditAccounts() { return creditAccounts; }

    public List<PaymentAccount> getPaymentAccounts() { return paymentAccounts; }

    public int getCreditRating() { return creditRating; }

    // Setters
    public void setUserId(int userId) { this.userId = userId; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public void setWorkplace(String workplace) { this.workplace = workplace; }

    public void setMonthlyIncome(double monthlyIncome) { this.monthlyIncome = monthlyIncome; }

    public void setBanks(List<Bank> banks) { this.banks = banks; }

    public void setCreditAccounts(List<CreditAccount> creditAccounts) { this.creditAccounts = creditAccounts; }

    public void setPaymentAccounts(List<PaymentAccount> paymentAccounts) { this.paymentAccounts = paymentAccounts; }

    public void setCreditRating(int creditRating) { this.creditRating = creditRating; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", workplace='" + workplace + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", banks=" + banks +
                ", creditAccounts=" + creditAccounts +
                ", paymentAccounts=" + paymentAccounts +
                ", creditRating=" + creditRating +
                '}';
    }
}
