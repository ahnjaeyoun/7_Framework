package market.seller.model.service;

import java.util.List;

import market.seller.model.dto.sellerVO;

public interface sellerService {

	List<sellerVO> list();

	int regist(sellerVO seller);

	int update(int sellerId);

	int delete(int sellerId);

}
