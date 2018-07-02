package org.easysoft.smartbook.services;

import java.util.List;

public interface BaseService<T> {
	
	public boolean save(T entity);
	
	public boolean delete(T entity);
	
	public T get(T entity);
	
	public List<T> list(T entity);

}
