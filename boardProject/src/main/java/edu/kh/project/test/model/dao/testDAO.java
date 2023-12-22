package edu.kh.project.test.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.test.model.dto.testVO;

@Repository
public class testDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public int regist() {
		return sqlSession.insert("testMapper.regist");
	}

	public List<testVO> list() {
		return sqlSession.selectList("testMapper.list");
	}

	public int update() {
		return sqlSession.update("testMapper.update");
	}

	public int delete() {
		
		// 등록된 정보(행)의 삭제여부 컬럼에 따라 update만 해주는 경우
		// return sqlSession.update("testMapper.delete");
		
		// 등록된 정보(행)을 직접 삭제할 경우
		return sqlSession.delete("testMapper.delete");
	}

}
