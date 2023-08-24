package egovframework.product.service.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.product.service.ProductService;
import egovframework.product.service.ProductVO;

@Controller
@SessionAttributes("product")
public class ProductController {
	@Resource(name="productService")
	private ProductService productService;
	
	@RequestMapping(value="/insertProduct.do",method=RequestMethod.GET)
	public String insertProductView(ProductVO vo) throws Exception{
		System.out.println("등록 화면이동");
		return "insertProduct";
	}
	@RequestMapping(value="/insertProduct.do",method=RequestMethod.POST)
	public String insertProduct(ProductVO vo) throws Exception{
		System.out.println("등록 중");
		productService.insertProduct(vo);
		return "forward:ListProduct.do";
	}
	
	@RequestMapping("selectProduct.do")
	public String selectProduct(ProductVO vo, Model model) throws Exception {
		System.out.println("특정 글 조회");
		model.addAttribute("product",productService.selectProduct(vo));
		return "selectProduct";
	}
	@RequestMapping("ListProduct.do")
	public String ListProduct(ProductVO vo , Model model) throws Exception{
		model.addAttribute("productList",productService.selectProductList(vo));
		return "ListProduct";
	}
	@RequestMapping("updateProduct.do")
	public String updateProduct(ProductVO vo)throws Exception{
		System.out.println("업데이트");
		productService.updateProduct(vo);
		return "forward:ListProduct.do";
	}
	@RequestMapping("deleteProduct.do")
	public String deleteProduct(ProductVO vo)throws Exception{
		System.out.println("삭제");
		productService.deleteProduct(vo);
		return "forward:ListProduct.do";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("test.do")
//	public String test() {
//		return "test";
//	}
}
