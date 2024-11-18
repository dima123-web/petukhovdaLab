package org.example.petukhovdavt211lab.service;


import org.example.petukhovdavt211lab.dto.UserDto;
import org.example.petukhovdavt211lab.entity.User;

import java.time.LocalDate;

public interface UserService {
    UserDto createUser(String fullName, LocalDate birthDate, String workplace);

    User getUserById(Long id);

    UserDto getUserByIdDto(Long id);

    UserDto updateUser(Long id, String fullName, String workplace);

    void deleteUser(Long id);
}
