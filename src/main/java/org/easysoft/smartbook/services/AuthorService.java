package org.easysoft.smartbook.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.easysoft.smartbook.beans.Author;
import org.easysoft.smartbook.db.mappers.AuthorMapper;
import org.easysoft.smartbook.db.mappers.MyBatisUtil;

public class AuthorService extends BaseService<Author> {

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
	public List<Author> search() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			AuthorMapper mapper = sqlSession.getMapper(AuthorMapper.class);
			return mapper.search();
		} finally{
			sqlSession.close();
		}
	}


	@Override
	public boolean insert(Author entity) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(Author entity) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
