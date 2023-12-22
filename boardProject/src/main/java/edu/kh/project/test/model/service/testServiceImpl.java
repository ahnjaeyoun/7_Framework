package edu.kh.project.test.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.test.model.dao.testDAO;
import edu.kh.project.test.model.dto.testVO;

@Service
public class testServiceImpl implements testService{
	
	@Autowired
	private testDAO dao;

	@Override
	@Transactional
	public int regist() {
		
		return dao.regist();
	}

	@Override
	public List<testVO> list() {
		return dao.list();
	}

	@Override
	@Transactional
	public int update() {
		return dao.update();
	}

	@Override
	@Transactional
	public int delete() {
		return dao.delete();
	}
	
	

}
