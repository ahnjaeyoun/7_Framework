package edu.kh.project.test.model.service;

import java.util.List;

import edu.kh.project.test.model.dto.testVO;

public interface testService {

	int regist();

	List<testVO> list();

	int update();

	int delete();

	

	
}
