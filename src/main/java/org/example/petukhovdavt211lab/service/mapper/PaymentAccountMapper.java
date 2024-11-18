package org.example.petukhovdavt211lab.service.mapper;

import org.example.petukhovdavt211lab.dto.PaymentAccountDto;
import org.example.petukhovdavt211lab.entity.PaymentAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentAccountMapper {

    @Mapping(source = "bank.id", target = "bankId")
    @Mapping(source = "user.id", target = "userId")
    PaymentAccountDto toDto(PaymentAccount paymentAccount);

}
