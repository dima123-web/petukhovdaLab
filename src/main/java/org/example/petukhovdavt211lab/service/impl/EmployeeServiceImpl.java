package org.example.petukhovdavt211lab.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.petukhovdavt211lab.dto.EmployeeDto;
import org.example.petukhovdavt211lab.entity.Bank;
import org.example.petukhovdavt211lab.entity.BankOffice;
import org.example.petukhovdavt211lab.entity.Employee;
import org.example.petukhovdavt211lab.repository.BankRepository;
import org.example.petukhovdavt211lab.repository.EmployeeRepository;
import org.example.petukhovdavt211lab.service.BankOfficeService;
import org.example.petukhovdavt211lab.service.BankService;
import org.example.petukhovdavt211lab.service.EmployeeService;
import org.example.petukhovdavt211lab.service.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final BankRepository bankRepository;
    private final BankService bankService;
    private final BankOfficeService bankOfficeService;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto createEmployee(String fullName, LocalDate birthDate, String position, Long bankId,
                                      Boolean isRemote, Long bankOfficeId, Boolean canIssueLoans, Integer salary) {
        Employee employee = new Employee();
        employee.setFullName(fullName);
        employee.setBirthDate(birthDate);
        employee.setPosition(position);
        Bank bank = bankService.getBankById(bankId);
        bank.setCountEmployees(bank.getCountEmployees() + 1);
        employee.setBank(bank);
        employee.setIsRemote(isRemote);
        employee.setOffice(bankOfficeService.getBankOfficeById(bankOfficeId));
        employee.setCanIssueLoans(canIssueLoans);
        employee.setSalary(salary);
        bankRepository.save(bank);
        employeeRepository.save(employee);
        return employeeMapper.toDto(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    @Override
    public EmployeeDto getEmployeeByIdDto(Long id) {
        return employeeMapper.toDto(getEmployeeById(id));
    }

    @Override
    public EmployeeDto updateEmployee(Long id, String fullName, String position, Long bankId,
                                   Boolean isRemote, Long bankOfficeId, Boolean canIssueLoans, Integer salary) {
        Employee employee = getEmployeeById(id);
        employee.setFullName(fullName);
        employee.setPosition(position);
        employee.setBank(bankService.getBankById(bankId));
        employee.setIsRemote(isRemote);
        employee.setOffice(bankOfficeService.getBankOfficeById(bankOfficeId));
        employee.setCanIssueLoans(canIssueLoans);
        employee.setSalary(salary);
        employeeRepository.save(employee);
        return employeeMapper.toDto(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = getEmployeeById(id);
        Bank bank = employee.getBank();
        bank.setCountEmployees(bank.getCountEmployees() - 1);
        bankRepository.save(bank);
        employeeRepository.deleteById(id);
    }
}
