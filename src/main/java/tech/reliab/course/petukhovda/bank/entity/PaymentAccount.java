package tech.reliab.course.petukhovda.bank.entity;

public class PaymentAccount {
    private int paymentAccountId;
    private User user;
    private String bankName;
    private double amount;

    public PaymentAccount() {}

    public PaymentAccount(int paymentAccountId, User user, String bankName, double amount) {
        this.paymentAccountId = paymentAccountId;
        this.user = user;
        this.bankName = bankName;
        this.amount = amount;
    }

    // Getters
    public int getPaymentAccountId() { return paymentAccountId; }

    public User getUser() { return user; }

    public String getBankName() { return bankName; }

    public double getAmount() { return amount; }

    // Setters

    public void setPaymentAccountId(int paymentAccountId) { this.paymentAccountId = paymentAccountId; }

    public void setUser(User user) { this.user = user; }

    public void setBankName(String bankName) { this.bankName = bankName; }

    public void setAmount(double amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                "paymentAccountId=" + paymentAccountId +
                ", user=" + user +
                ", bankName='" + bankName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
