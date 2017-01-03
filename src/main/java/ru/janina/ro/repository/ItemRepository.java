package ru.janina.ro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.janina.ro.entity.Blog;
import ru.janina.ro.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	List<Item> findByBlog(Blog blog);
}
