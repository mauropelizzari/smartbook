package org.easysoft.smartbook.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.easysoft.smartbook.beans.Illustrator;
import org.easysoft.smartbook.data.MyBatisUtil;
import org.easysoft.smartbook.data.mappers.IllustratorMapper;


public class IllustratorService extends BaseService<Illustrator> {

	@Override
	public boolean delete(Illustrator entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Illustrator get(Illustrator entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Illustrator> search() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			IllustratorMapper mapper = sqlSession.getMapper(IllustratorMapper.class);
			return mapper.search();
		} finally{
			sqlSession.close();
		}
	}


	@Override
	public boolean insert(Illustrator entity) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(Illustrator entity) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
