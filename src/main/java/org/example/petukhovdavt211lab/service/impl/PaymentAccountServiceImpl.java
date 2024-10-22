package org.example.petukhovdavt211lab.service.impl;


import lombok.RequiredArgsConstructor;
import org.example.petukhovdavt211lab.entity.Bank;
import org.example.petukhovdavt211lab.entity.PaymentAccount;
import org.example.petukhovdavt211lab.entity.User;
import org.example.petukhovdavt211lab.repository.BankRepository;
import org.example.petukhovdavt211lab.repository.PaymentAccountRepository;
import org.example.petukhovdavt211lab.repository.UserRepository;
import org.example.petukhovdavt211lab.service.BankService;
import org.example.petukhovdavt211lab.service.PaymentAccountService;
import org.example.petukhovdavt211lab.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentAccountServiceImpl implements PaymentAccountService {

    private final PaymentAccountRepository paymentAccountRepository;
    private final BankRepository bankRepository;
    private final UserService userServices;
    private final BankService bankService;
    private final UserRepository userRepository;

    public User addBankToUser(Long userId, Long bankId) {
        User user = userServices.getUserById(userId);
        Bank bank = bankService.getBankById(bankId);
        user.getBanks().add(bank);
        return userRepository.save(user);
    }

    public User addPaymentAccountToUser(Long userId, Long paymentAccountId) {
        User user = userServices.getUserById(userId);
        PaymentAccount paymentAccount = getPaymentAccountById(paymentAccountId);
        user.getPaymentAccounts().add(paymentAccount);
        return userRepository.save(user);
    }

    @Override
    public PaymentAccount createPaymentAccount(Long userId, Long bankId) {
        PaymentAccount paymentAccount = new PaymentAccount();
        paymentAccount.setUser(userServices.getUserById(userId));
        Bank bank = bankService.getBankById(bankId);
        bank.setCountClients(bank.getCountClients() + 1);
        paymentAccount.setBank(bank);
        paymentAccount.setAmount(0);
        addBankToUser(userId, bankId);
        bankRepository.save(bank);
        paymentAccountRepository.save(paymentAccount);
        addPaymentAccountToUser(userId, paymentAccount.getId());
        return paymentAccount;
    }

    @Override
    public PaymentAccount getPaymentAccountById(Long id) {
        return paymentAccountRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Payment account Atm not found with id " + id));
    }

    @Override
    public PaymentAccount updatePaymentAccount(Long id, Integer amount) {
        PaymentAccount paymentAccount = getPaymentAccountById(id);
        paymentAccount.setAmount(amount);
        paymentAccountRepository.save(paymentAccount);
        return paymentAccount;
    }

    @Override
    public void deletePaymentAccount(Long id) {
        PaymentAccount paymentAccount = getPaymentAccountById(id);
        Bank bank = paymentAccount.getBank();
        bank.setCountClients(bank.getCountClients() - 1);
        bankRepository.save(bank);
        paymentAccountRepository.deleteById(id);
    }
}
