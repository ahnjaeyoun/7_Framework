package edu.kh.project.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kh.project.test.model.dto.testVO;
import edu.kh.project.test.model.service.testService;

@RequestMapping("/test")
@Controller
public class testController {
	
	@Autowired
	private testService service;
	
	@PostMapping("/regist")
	public String testRigist() {
		
		int registResult = service.regist();
		
		return "등록 처리 후 요청 주소 작성(prefix, sufix 적용)";
	}
	
	@GetMapping("/list")
	public String testList() {
		
		List<testVO> list = new ArrayList<testVO>();
		
		list = service.list();
		
		return "목록 조회 후 요청 주소 작성(prefix, sufix 적용)";
	}
	
	@PostMapping("/update")
	public String testUpdate() {
		
		int updateResult = service.update();
		
		return "업데이트 후 요청 주소 작성(prefix, sufix 적용)";
	}
	
	@GetMapping("/delete")
	public String testDelete() {
		
		int deleteResult = service.delete();
		
		return "삭제 후 요청 주소 작성(prefix, sufix 적용)";
	}
}
