package org.example.petukhovdavt211lab.service;

import org.example.petukhovdavt211lab.dto.BankDto;
import org.example.petukhovdavt211lab.entity.Bank;

public interface BankService {

    BankDto createBank(String bankName);

    Bank getBankById(Long id);

    BankDto getBankByIdDto(Long id);

    BankDto updateBank(Long id, String name);

    void deleteBank(Long id);
}
