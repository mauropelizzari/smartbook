package org.easysoft.smartbook.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.easysoft.smartbook.beans.Person;
import org.easysoft.smartbook.db.mappers.MyBatisUtil;
import org.easysoft.smartbook.db.mappers.PersonMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements BaseService<Person> {

	@Override
	public boolean insert(Person entity) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			PersonMapper peronsMapper = sqlSession.getMapper(PersonMapper.class);
			peronsMapper.insert(entity);
			sqlSession.commit();
			return true;
		} finally{
			sqlSession.close();
		}

	}

	@Override
	public boolean delete(Person entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person get(Person entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> list(Person entity) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			PersonMapper peronsMapper = sqlSession.getMapper(PersonMapper.class);
			return peronsMapper.list(entity);
		} finally{
			sqlSession.close();
		}
	}

	@Override
	public boolean update(Person entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
