package org.example.petukhovdavt211lab.service;

import org.example.petukhovdavt211lab.entity.Bank;
import org.example.petukhovdavt211lab.entity.BankAtm;
import org.example.petukhovdavt211lab.entity.BankOffice;
import org.example.petukhovdavt211lab.entity.Employee;

public interface BankAtmService {

    BankAtm createBankAtm(String name, String address, Boolean status, Long bankId,
                          Long bankOfficeId, Long employeeId, Boolean isIssuingMoney,
                          Boolean isDepositingMoney, Integer servicingCost);

    BankAtm getBankAtmById(Long id);

    BankAtm updateBankAtm(Long id, String name, String address, Boolean status, Long bankId,
                       Long bankOfficeId, Long employeeId, Boolean isIssuingMoney,
                       Boolean isDepositingMoney, Integer servicingCost);

    void deleteBankAtm(Long id);
}
