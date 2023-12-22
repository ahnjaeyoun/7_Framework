package market.product.model.service;

import java.util.List;

import market.product.model.dto.productVO;

public interface productService {

	int regist(productVO product);

	List<productVO> list();

	int update(int productNum);

	int delete(int productNum);

}
