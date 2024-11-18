package org.example.petukhovdavt211lab.service.mapper;

import org.example.petukhovdavt211lab.dto.CreditAccountDto;
import org.example.petukhovdavt211lab.entity.CreditAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CreditAccountMapper {

    @Mapping(source = "user.fullName", target = "userName")
    @Mapping(source = "bank.name", target = "bankName")
    @Mapping(source = "issuingEmployee.fullName", target = "issuingEmployeeName")
    @Mapping(source = "paymentAccount.amount", target = "paymentAccountAmount")
    CreditAccountDto toDto(CreditAccount creditAccount);

}
