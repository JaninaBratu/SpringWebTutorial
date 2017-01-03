package ru.janina.ro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.janina.ro.entity.Blog;
import ru.janina.ro.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	List<Blog> findByUser(User user);
}
