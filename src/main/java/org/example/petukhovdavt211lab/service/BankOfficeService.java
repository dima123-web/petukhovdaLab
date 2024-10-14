package org.example.petukhovdavt211lab.service;

import org.example.petukhovdavt211lab.entity.BankOffice;

public interface BankOfficeService {
    BankOffice createBankOffice(Long bankId, String name, String address, Boolean status,
                          Boolean canPlaceAtm, Boolean canIssueLoan, Boolean isIssuingMoney,
                          Boolean isDepositingMoney, Integer rentalCost);

    BankOffice getBankOfficeById(Long id);

    BankOffice updateBankOffice(Long id, Long bankId, String name, String address, Boolean status,
                          Boolean canPlaceAtm, Boolean canIssueLoan, Boolean isIssuingMoney,
                          Boolean isDepositingMoney, Integer rentalCost);

    void deleteBankOffice(Long id);
}
