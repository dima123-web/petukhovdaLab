package org.example.petukhovdavt211lab.service;


import org.example.petukhovdavt211lab.entity.User;

import java.time.LocalDate;

public interface UserService {
    User createUser(String fullName, LocalDate birthDate, String workplace);

    User getUserById(Long id);

    User updateUser(Long id, String fullName, String workplace);

    void deleteUser(Long id);
}
