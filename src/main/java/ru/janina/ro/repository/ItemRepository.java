package ru.janina.ro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.janina.ro.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
