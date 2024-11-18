package org.example.petukhovdavt211lab.service;

import org.example.petukhovdavt211lab.dto.PaymentAccountDto;
import org.example.petukhovdavt211lab.entity.PaymentAccount;


public interface PaymentAccountService {
    PaymentAccountDto createPaymentAccount(Long userId, Long bankId);

    PaymentAccount getPaymentAccountById(Long id);

    PaymentAccountDto getPaymentAccountByIdDto(Long id);

    PaymentAccountDto updatePaymentAccount(Long id, Integer amount);

    void deletePaymentAccount(Long id);
}
