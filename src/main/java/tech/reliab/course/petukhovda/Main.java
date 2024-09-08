package tech.reliab.course.petukhovda;

import tech.reliab.course.petukhovda.bank.entity.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(1, "Alfa");
        System.out.println(bank);

        BankOffice bankOffice = new BankOffice(1, bank, "AlfaTop", "Moscow",
                "работает", true, true,
                true, true, 478, 10);
        System.out.println(bankOffice);

        Employee employee = new Employee(1, "da", LocalDate.now(),
                "manager", bank, true, bankOffice, true, 500);
        System.out.println(employee);

        BankAtm bankAtm = new BankAtm(1, "AlafaAtm", "работает", bank, bankOffice,
                employee, true, true, 100, 400);
        System.out.println(bankAtm);

        User user = new User(1, "da", LocalDate.now(), "завод");
        System.out.println(user);

        PaymentAccount paymentAccount = new PaymentAccount(1, user, "da", 400);
        System.out.println(paymentAccount);

        CreditAccount creditAccount = new CreditAccount(1, user, "Alfa",
                LocalDate.now(), LocalDate.now(), 10,
                200, 100 ,50, employee, paymentAccount);
        System.out.println(creditAccount);
    }

}