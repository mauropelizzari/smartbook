package org.easysoft.smartbook.services;

import java.util.List;

public abstract class BaseService<T> {
	
	public abstract boolean insert(T entity);

	public abstract boolean update(T entity);
	
	public abstract boolean delete(T entity);
	
	public abstract T get(T entity);
	
	public abstract List<T> search();
	

}
