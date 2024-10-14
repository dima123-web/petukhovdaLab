package org.example.petukhovdavt211lab.repository;

import org.example.petukhovdavt211lab.entity.CreditAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditAccountRepository extends JpaRepository<CreditAccount, Long> {
}
