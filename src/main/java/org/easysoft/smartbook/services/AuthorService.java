package org.easysoft.smartbook.services;

import java.util.List;

import org.easysoft.smartbook.beans.Author;
import org.springframework.stereotype.Service;

@Service
public class AuthorService implements BaseService<Author> {

	public String sayHi() {
		return "Hello AuthorService!";
	}

	@Override
	public boolean save(Author entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Author entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Author get(Author entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> list(Author entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
