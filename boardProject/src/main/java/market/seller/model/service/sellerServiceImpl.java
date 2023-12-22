package market.seller.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.seller.model.dao.sellerRepository;
import market.seller.model.dto.sellerVO;

@Service
public class sellerServiceImpl implements sellerService{

	@Autowired
	private sellerRepository dao;
	
	@Override
	public List<sellerVO> list() {
		return dao.list();
	}

	@Override
	public int regist(sellerVO seller) {
		return dao.regist(seller);
	}

	@Override
	public int update(int sellerId) {
		return dao.update(sellerId);
	}

	@Override
	public int delete(int sellerId) {
		return dao.delete(sellerId);
	}

}
