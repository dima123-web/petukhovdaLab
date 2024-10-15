package org.example.petukhovdavt211lab.service;

import org.example.petukhovdavt211lab.entity.PaymentAccount;


public interface PaymentAccountService {
    PaymentAccount createPaymentAccount(Long userId, Long bankId);

    PaymentAccount getPaymentAccountById(Long id);

    PaymentAccount updatePaymentAccount(Long id, Integer amount);

    void deletePaymentAccount(Long id);
}
