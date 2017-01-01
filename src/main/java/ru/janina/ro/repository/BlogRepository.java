package ru.janina.ro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.janina.ro.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
