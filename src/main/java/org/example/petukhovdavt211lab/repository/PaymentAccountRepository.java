package org.example.petukhovdavt211lab.repository;

import org.example.petukhovdavt211lab.entity.PaymentAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentAccountRepository extends JpaRepository<PaymentAccount, Long> {
}
