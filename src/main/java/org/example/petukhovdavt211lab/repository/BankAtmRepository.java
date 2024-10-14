package org.example.petukhovdavt211lab.repository;

import org.example.petukhovdavt211lab.entity.BankAtm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAtmRepository extends JpaRepository<BankAtm, Long> {
}
