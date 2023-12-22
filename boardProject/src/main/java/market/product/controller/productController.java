package market.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import market.product.model.dto.productVO;
import market.product.model.service.productService;

@Controller
@RequestMapping("/product")
public class productController {
	
	@Autowired
	private productService service;
	

	@PostMapping("/regist")
	public String productRegist(productVO product) {
		
		int result = service.regist(product); 
		
		return "등록 후 연결 될 주소";
	}
	
	@GetMapping("/list")
	public String productList() {
		
		List<productVO> list = new ArrayList<productVO>();
		
		list = service.list();
		
		return "조회 후 연결 될 주소";
		
	}
	
	@PostMapping("/update")
	public String productUpdate(int productNum) {
		
		int result = service.update(productNum);
		
		return "업데이트 후 연결 될 주소";
	}
	
	@PostMapping("/delete")
	public String productDelete(int productNum) {
		
		int result = service.delete(productNum);
		
		return "삭제 후 연결 될 주소";
		
	}
	
	
}
