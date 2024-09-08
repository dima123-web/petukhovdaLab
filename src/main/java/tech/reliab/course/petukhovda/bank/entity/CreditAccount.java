package tech.reliab.course.petukhovda.bank.entity;

import java.time.LocalDate;

public class CreditAccount {
    private int creditAccountId;
    private User user;
    private String bankName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int numberOfMonths;
    private double loanAmount;
    private double monthlyPayment;
    private double interestRate;
    private Employee issuingEmployee;
    private PaymentAccount paymentAccount;

    public CreditAccount() {}

    public CreditAccount(int creditAccountId, User user, String bankName, LocalDate startDate,
                         LocalDate endDate, int numberOfMonths, double loanAmount, double monthlyPayment,
                         double interestRate, Employee issuingEmployee, PaymentAccount paymentAccount) {
        this.creditAccountId = creditAccountId;
        this.user = user;
        this.bankName = bankName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfMonths = numberOfMonths;
        this.loanAmount = loanAmount;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.issuingEmployee = issuingEmployee;
        this.paymentAccount = paymentAccount;
    }

    // Getters
    public int getCreditAccountId() { return creditAccountId; }

    public User getUser() { return user; }

    public String getBankName() { return bankName; }

    public LocalDate getStartDate() { return startDate; }

    public LocalDate getEndDate() { return endDate; }

    public int getNumberOfMonths() { return numberOfMonths; }

    public double getLoanAmount() { return loanAmount; }

    public double getMonthlyPayment() { return monthlyPayment; }

    public double getInterestRate() { return interestRate; }

    public Employee getIssuingEmployee() { return issuingEmployee; }

    public PaymentAccount getPaymentAccount() { return paymentAccount; }

    // Setters
    public void setCreditAccountId(int creditAccountId) { this.creditAccountId = creditAccountId; }

    public void setUser(User user) { this.user = user; }

    public void setBankName(String bankName) { this.bankName = bankName; }

    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public void setNumberOfMonths(int numberOfMonths) { this.numberOfMonths = numberOfMonths; }

    public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }

    public void setMonthlyPayment(double monthlyPayment) { this.monthlyPayment = monthlyPayment; }

    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public void setIssuingEmployee(Employee issuingEmployee) { this.issuingEmployee = issuingEmployee; }

    public void setPaymentAccount(PaymentAccount paymentAccount) { this.paymentAccount = paymentAccount; }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "creditAccountId=" + creditAccountId +
                ", user=" + user +
                ", bankName='" + bankName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", numberOfMonths=" + numberOfMonths +
                ", loanAmount=" + loanAmount +
                ", monthlyPayment=" + monthlyPayment +
                ", interestRate=" + interestRate +
                ", issuingEmployee=" + issuingEmployee +
                ", paymentAccount=" + paymentAccount +
                '}';
    }

}
