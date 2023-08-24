package egovframework.product.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.product.service.ProductDAO;
import egovframework.product.service.ProductService;
import egovframework.product.service.ProductVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
@Service("productService")
public class ProductServiceImpl extends EgovAbstractServiceImpl implements ProductService{
	@Resource(name="ProductIBatis")
	private ProductDAO productDAO;
	
	public ProductServiceImpl() {
		System.out.println("BoardServiceImpl()");
	}

	@Override
	public void insertProduct(ProductVO vo) throws Exception {
		productDAO.insertProduct(vo);
		
	}

	@Override
	public void updateProduct(ProductVO vo) throws Exception {
		productDAO.updateProduct(vo);
		
	}

	@Override
	public void deleteProduct(ProductVO vo) throws Exception {
		productDAO.deleteProduct(vo);
	}

	@Override
	public ProductVO selectProduct(ProductVO vo) throws Exception {
		
		return productDAO.selectProduct(vo);
	}

	@Override
	public List<ProductVO> selectProductList(ProductVO vo) throws Exception {
		return productDAO.selectProductList(vo);
	}
	
	
}
