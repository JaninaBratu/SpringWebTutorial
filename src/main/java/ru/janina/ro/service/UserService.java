package ru.janina.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.janina.ro.entity.Blog;
import ru.janina.ro.entity.Item;
import ru.janina.ro.entity.User;
import ru.janina.ro.repository.BlogRepository;
import ru.janina.ro.repository.ItemRepository;
import ru.janina.ro.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<User> findAll()
	{
		return userRepository.findAll();
	}

	public User findOne(int id) 
	{
		return userRepository.findOne(id);
	}

	@Transactional
	public User findOneWithBlogs(int id) {
		User user = findOne(id);
		List<Blog>blogs = blogRepository.findByUser(user);
		for(Blog blog:blogs)
		{
			List<Item> items = itemRepository.findByBlog(blog);
			blog.setItems(items);
		}
		user.setBlogs(blogs);
		return user;
	}
}
