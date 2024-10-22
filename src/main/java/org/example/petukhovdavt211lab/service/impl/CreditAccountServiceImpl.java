package org.example.petukhovdavt211lab.service.impl;


import lombok.RequiredArgsConstructor;
import org.example.petukhovdavt211lab.entity.Bank;
import org.example.petukhovdavt211lab.entity.CreditAccount;
import org.example.petukhovdavt211lab.entity.PaymentAccount;
import org.example.petukhovdavt211lab.entity.User;
import org.example.petukhovdavt211lab.repository.CreditAccountRepository;
import org.example.petukhovdavt211lab.repository.UserRepository;
import org.example.petukhovdavt211lab.service.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class CreditAccountServiceImpl implements CreditAccountService {

    private final CreditAccountRepository creditAccountRepository;
    private final UserService userService;
    private final BankService bankService;
    private final EmployeeService employeeService;
    private final PaymentAccountService paymentAccountService;
    private final UserRepository userRepository;

    public User addCreditAccountToUser(Long userId, Long creditAccountId) {
        User user = userService.getUserById(userId);
        CreditAccount creditAccount = getCreditAccountById(creditAccountId);
        user.getCreditAccounts().add(creditAccount);
        return userRepository.save(user);
    }

    @Override
    public CreditAccount createCreditAccount(Long userId, Long bankId, LocalDate startDate, LocalDate endDate,
                                             Integer loanAmount, Float interestRate, Long issuingEmployeeId,
                                             Long paymentAccountId) {
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setUser(userService.getUserById(userId));
        Bank bank = bankService.getBankById(bankId);
        creditAccount.setBank(bank);
        creditAccount.setStartDate(startDate);
        creditAccount.setEndDate(endDate);
        creditAccount.setNumberOfMonths(endDate.getDayOfMonth() - startDate.getDayOfMonth());
        creditAccount.setLoanAmount(loanAmount);
        if (interestRate <= bank.getInterestRate())
            creditAccount.setInterestRate(interestRate);
        else
            throw new RuntimeException("High interest rate");

        double monthlyRate = interestRate / 12 / 100;
        double monthlyPayment = loanAmount * (monthlyRate / (1 - Math.pow(1 + monthlyRate, creditAccount.getNumberOfMonths())));
        creditAccount.setMonthlyPayment((int)monthlyPayment);
        creditAccount.setIssuingEmployee(employeeService.getEmployeeById(issuingEmployeeId));
        creditAccount.setPaymentAccount(paymentAccountService.getPaymentAccountById(paymentAccountId));
        creditAccountRepository.save(creditAccount);
        addCreditAccountToUser(userId, creditAccount.getId());
        return creditAccount;
    }

    @Override
    public CreditAccount getCreditAccountById(Long id) {
        return creditAccountRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Credit account not found with id " + id));
    }

    @Override
    public CreditAccount updateCreditAccount(Long id, Long paymentAccountId) {
        CreditAccount creditAccount = getCreditAccountById(id);
        creditAccount.setPaymentAccount(paymentAccountService.getPaymentAccountById(paymentAccountId));
        creditAccountRepository.save(creditAccount);
        return creditAccount;
    }

    @Override
    public void deleteCreditAccount(Long id) {
        creditAccountRepository.deleteById(id);
    }
}
