package market.seller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import market.seller.model.dto.sellerVO;
import market.seller.model.service.sellerService;

@Controller
@RequestMapping("/seller")
public class sellerController {

	@Autowired
	private sellerService service;

	@PostMapping("/regist")
	public String sellerRegist(sellerVO seller) {
		
		int result = service.regist(seller);
		
		return "등록 후 연결 주소";
	}
	
	@GetMapping("/list")
	public String sellerList() {
		
		List<sellerVO> list = new ArrayList<sellerVO>();
		
		list = service.list();
		
		return "조회 후 연결 주소";
	}
	
	@PostMapping("/update")
	public String sellerUpdate(int sellerId) {
		
		int result = service.update(sellerId);
		
		return "업데이트 후 연결 주소";
	}
	
	@PostMapping("/delete")
	public String sellerDelete(int sellerId) {
		
		int result = service.delete(sellerId);
		
		return "삭제 후 연결 주소";
		
	}
	
}
