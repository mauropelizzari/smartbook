package org.easysoft.smartbook.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.easysoft.smartbook.beans.Book;
import org.easysoft.smartbook.data.MyBatisUtil;
import org.easysoft.smartbook.data.mappers.BookMapper;


public class BookService extends BaseService<Book> {

	@Override
	public boolean delete(Book entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book get(Book entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> search() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			BookMapper mapper = sqlSession.getMapper(BookMapper.class);
			return mapper.search();
		} finally{
			sqlSession.close();
		}
	}


	@Override
	public boolean insert(Book entity) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(Book entity) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
