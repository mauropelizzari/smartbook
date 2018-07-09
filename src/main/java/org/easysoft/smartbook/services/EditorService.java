package org.easysoft.smartbook.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.easysoft.smartbook.beans.Editor;
import org.easysoft.smartbook.db.mappers.EditorMapper;
import org.easysoft.smartbook.db.mappers.MyBatisUtil;

public class EditorService extends BaseService<Editor> {

	@Override
	public boolean delete(Editor entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Editor get(Editor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Editor> search() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			EditorMapper mapper = sqlSession.getMapper(EditorMapper.class);
			return mapper.search();
		} finally{
			sqlSession.close();
		}
	}


	@Override
	public boolean insert(Editor entity) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(Editor entity) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
