package org.example.petukhovdavt211lab.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.petukhovdavt211lab.entity.BankAtm;
import org.example.petukhovdavt211lab.entity.BankOffice;
import org.example.petukhovdavt211lab.entity.Employee;
import org.example.petukhovdavt211lab.repository.BankAtmRepository;
import org.example.petukhovdavt211lab.service.BankAtmService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankAtmServiceImpl implements BankAtmService {

    private final BankAtmRepository bankAtmRepository;


    @Override
    public BankAtm createBankAtm(String name, String address, Boolean status, Long bankId,
                              Long bankOfficeId, Long employeeId, Boolean isIssuingMoney,
                              Boolean isDepositingMoney, Integer servicingCost) {
        BankAtm bankAtm = new BankAtm();
        bankAtm.setName(name);
        bankAtm.setAddress(address);
        bankAtm.setStatus(status);

        return null;
    }

    @Override
    public BankAtm getBankAtmById(Long id) {
        return null;
    }

    @Override
    public BankAtm updateBankAtm(Long id, String name, String address, Boolean status, Long bankId,
                              Long bankOfficeId, Long employeeId, Boolean isIssuingMoney,
                              Boolean isDepositingMoney, Integer servicingCost) {
        return null;
    }

    @Override
    public void deleteBankAtm(Long id) {

    }
}
