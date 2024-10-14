package org.example.petukhovdavt211lab.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.petukhovdavt211lab.entity.BankOffice;
import org.example.petukhovdavt211lab.entity.Employee;
import org.example.petukhovdavt211lab.repository.EmployeeRepository;
import org.example.petukhovdavt211lab.service.BankOfficeService;
import org.example.petukhovdavt211lab.service.BankService;
import org.example.petukhovdavt211lab.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final BankService bankService;
    private final BankOfficeService bankOfficeService;

    @Override
    public Employee createEmployee(String fullName, LocalDate birthDate, String position, Long bankId,
                                   Boolean isRemote, Long bankOfficeId, Boolean canIssueLoans, Integer salary) {
        Employee employee = new Employee();
        employee.setFullName(fullName);
        employee.setBirthDate(birthDate);
        employee.setPosition(position);
        employee.setBank(bankService.getBankById(bankId));
        employee.setIsRemote(isRemote);
        employee.setOffice(bankOfficeService.getBankOfficeById(bankOfficeId));
        employee.setCanIssueLoans(canIssueLoans);
        employee.setSalary(salary);
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    @Override
    public Employee updateEmployee(Long id, String fullName, LocalDate birthDate, String position, Long bankId,
                                   Boolean isRemote, Long bankOfficeId, Boolean canIssueLoans, Integer salary) {
        Employee employee = getEmployeeById(id);
        employee.setFullName(fullName);
        employee.setBirthDate(birthDate);
        employee.setPosition(position);
        employee.setBank(bankService.getBankById(bankId));
        employee.setIsRemote(isRemote);
        employee.setOffice(bankOfficeService.getBankOfficeById(bankOfficeId));
        employee.setCanIssueLoans(canIssueLoans);
        employee.setSalary(salary);
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
