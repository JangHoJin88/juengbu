package egovframework.product.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.product.service.ProductDAO;
import egovframework.product.service.ProductVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("ProductIBatis")
public class ProductDAOIBatis extends EgovAbstractDAO implements ProductDAO{
	public ProductDAOIBatis() {
		System.out.println("ProductIBatis 생성자");
	}

	@Override
	public void insertProduct(ProductVO vo) throws Exception {
		insert("ProductDAO.insertProduct",vo);
		
	}

	@Override
	public void updateProduct(ProductVO vo) throws Exception {
		update("ProductDAO.updateProduct",vo);
		
	}

	@Override
	public void deleteProduct(ProductVO vo) throws Exception {
		delete("ProductDAO.deleteProduct",vo);
	}

	@Override
	public ProductVO selectProduct(ProductVO vo) throws Exception {
		return (ProductVO)select("ProductDAO.selectProduct",vo);
	}

	@Override
	public List<ProductVO> selectProductList(ProductVO vo) throws Exception {
		return (List<ProductVO>) list ("ProductDAO.selectProductList",vo);
	}

	
	
	
}
