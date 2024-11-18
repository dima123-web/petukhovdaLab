package org.example.petukhovdavt211lab.service.mapper;

import org.example.petukhovdavt211lab.dto.BankDto;
import org.example.petukhovdavt211lab.entity.Bank;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankMapper {

    BankDto toDto(Bank bank);

}
