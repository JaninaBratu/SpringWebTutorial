package ru.janina.ro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.janina.ro.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
