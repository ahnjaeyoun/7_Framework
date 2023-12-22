package market.seller.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import market.seller.model.dto.sellerVO;

@Repository
public class sellerRepository {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<sellerVO> list() {
		return sqlSession.selectOne("sellerMapper.list");
	}

	public int regist(sellerVO seller) {
		return sqlSession.insert("sellerMapper.regist", seller);
	}

	public int update(int sellerId) {
		return sqlSession.update("sellerMapper.update", sellerId);
	}

	public int delete(int sellerId) {
		return sqlSession.delete("sellerMapper.delete", sellerId);
	}

}
