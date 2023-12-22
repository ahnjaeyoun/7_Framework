package market.product.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.product.model.dao.productRepository;
import market.product.model.dto.productVO;

@Service
public class productServiceImpl implements productService{
	
	@Autowired
	private productRepository dao;

	@Override
	public int regist(productVO product) {
		
		return dao.regist(product);
	}

	@Override
	public List<productVO> list() {
		return dao.list();
	}

	@Override
	public int update(int productNum) {
		return dao.update(productNum);
	}

	@Override
	public int delete(int productNum) {
		return dao.delete(productNum);
	}

}
