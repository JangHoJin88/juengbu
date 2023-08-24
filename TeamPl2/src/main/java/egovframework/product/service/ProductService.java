package egovframework.product.service;

import java.util.List;

public interface ProductService {
	void insertProduct(ProductVO vo)throws Exception;
	void updateProduct(ProductVO vo)throws Exception;
	void deleteProduct(ProductVO vo)throws Exception;
	ProductVO selectProduct(ProductVO vo)throws Exception;
	List<ProductVO> selectProductList(ProductVO vo)throws Exception;
}
