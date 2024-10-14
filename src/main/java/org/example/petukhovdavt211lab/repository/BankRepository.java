package org.example.petukhovdavt211lab.repository;

import org.example.petukhovdavt211lab.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
}
