package com.larrieu.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.larrieu.workshopmongo.domain.Post;
import com.larrieu.workshopmongo.domain.User;
import com.larrieu.workshopmongo.dto.UserDTO;
import com.larrieu.workshopmongo.repository.PostRepository;
import com.larrieu.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	@Autowired
	private PostRepository repo;
		
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	
}
