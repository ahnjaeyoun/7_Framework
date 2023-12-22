package market.product.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import market.product.model.dto.productVO;

@Repository
public class productRepository {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int regist(productVO product) {
		
		return sqlSession.insert("productMapper.regist", product);
	}

	public List<productVO> list() {
		return sqlSession.selectOne("productMapper.list");
	}

	public int update(int productNum) {
		return sqlSession.update("productMapper.update", productNum);
	}

	public int delete(int productNum) {
		return sqlSession.delete("productMapper.delete", productNum);
	}

}
