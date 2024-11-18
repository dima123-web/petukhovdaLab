package org.example.petukhovdavt211lab.service.mapper;


import org.example.petukhovdavt211lab.dto.BankAtmDto;
import org.example.petukhovdavt211lab.entity.BankAtm;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BankAtmMapper {

    @Mapping(source = "location.address", target = "locationAddress")
    @Mapping(source = "servicingEmployee.fullName", target = "servicingEmployeeName")
    @Mapping(source = "bank.name", target = "bankName")
    BankAtmDto toDto(BankAtm bankAtm);

}
