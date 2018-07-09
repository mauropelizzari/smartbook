package org.easysoft.smartbook.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.easysoft.smartbook.beans.Argument;
import org.easysoft.smartbook.db.mappers.ArgumentMapper;
import org.easysoft.smartbook.db.mappers.MyBatisUtil;

public class ArgumentService extends BaseService<Argument> {

	@Override
	public boolean delete(Argument entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Argument get(Argument entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Argument> search() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			ArgumentMapper mapper = sqlSession.getMapper(ArgumentMapper.class);
			return mapper.search();
		} finally{
			sqlSession.close();
		}
	}


	@Override
	public boolean insert(Argument entity) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(Argument entity) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
