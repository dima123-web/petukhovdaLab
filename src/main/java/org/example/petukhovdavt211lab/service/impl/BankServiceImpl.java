package org.example.petukhovdavt211lab.service.impl;


import lombok.RequiredArgsConstructor;
import org.example.petukhovdavt211lab.entity.Bank;
import org.example.petukhovdavt211lab.repository.BankRepository;
import org.example.petukhovdavt211lab.service.BankService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;

    @Override
    public Bank createBank(String name) {
        Bank bank = new Bank();
        bank.setName(name);
        bank.setRating((int)(Math.random() * 101));
        bank.setTotalMoney((int)(Math.random() * 1_000_001));
        bank.setInterestRate((float)(Math.random() * (20 - (bank.getRating() / 5.0)) + 1));
        bankRepository.save(bank);
        return bank;
    }

    @Override
    public Bank getBankById(Long id) {
        return bankRepository.findById(id).orElseThrow(() -> new RuntimeException("Bank not found with id " + id));
    }

    @Override
    public Bank updateBank(Long id, String name) {
        Bank bank = getBankById(id);
        bank.setName(name);
        bankRepository.save(bank);
        return bank;
    }

    @Override
    public void deleteBank(Long id) {
        bankRepository.deleteById(id);
    }
}
