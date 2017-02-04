package ru.janina.ro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.janina.ro.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
	