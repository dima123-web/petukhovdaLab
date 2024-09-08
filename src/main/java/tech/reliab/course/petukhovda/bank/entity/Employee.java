package tech.reliab.course.petukhovda.bank.entity;

import java.time.LocalDate;

public class Employee {
    private int employeeId;
    private String fullName;
    private LocalDate birthDate;
    private String position;
    private Bank bank;
    private boolean isRemote;
    private BankOffice office;
    private boolean canIssueLoans;
    private double salary;

    public Employee() {}

    public Employee(int employeeId, String fullName, LocalDate birthDate, String position,
                    Bank bank, boolean isRemote, BankOffice office,
                    boolean canIssueLoans, double salary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.position = position;
        this.bank = bank;
        bank.addCountEmployees();
        this.isRemote = isRemote;
        this.office = office;
        this.canIssueLoans = canIssueLoans;
        this.salary = salary;
    }

    // Getters
    public int getEmployeeId() { return employeeId; }

    public String getFullName() { return fullName; }

    public LocalDate getBirthDate() { return birthDate; }

    public String getPosition() { return position; }

    public Bank getBank() { return bank; }

    public boolean isRemote() { return isRemote; }

    public BankOffice getOffice() { return office; }

    public boolean isCanIssueLoans() { return canIssueLoans; }

    public double getSalary() { return salary; }

    // Setters
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public void setPosition(String position) { this.position = position; }

    public void setBank(Bank bank) { this.bank = bank; }

    public void setRemote(boolean remote) { isRemote = remote; }

    public void setOffice(BankOffice office) { this.office = office; }

    public void setCanIssueLoans(boolean canIssueLoans) { this.canIssueLoans = canIssueLoans; }

    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", position='" + position + '\'' +
                ", bank=" + bank +
                ", isRemote=" + isRemote +
                ", office=" + office +
                ", canIssueLoans=" + canIssueLoans +
                ", salary=" + salary +
                '}';
    }
}
