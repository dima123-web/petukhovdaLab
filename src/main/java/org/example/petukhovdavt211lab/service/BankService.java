package org.example.petukhovdavt211lab.service;

import org.example.petukhovdavt211lab.entity.Bank;

public interface BankService {

    Bank createBank(String bankName);

    Bank getBankById(Long id);

    Bank updateBank(Long id, String name);

    void deleteBank(Long id);
}
