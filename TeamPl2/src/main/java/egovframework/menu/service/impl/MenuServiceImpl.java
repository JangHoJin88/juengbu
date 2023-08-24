package egovframework.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.menu.service.MenuDAO;
import egovframework.menu.service.MenuService;
import egovframework.menu.service.MenuVO;

@Service("menuService")
public class MenuServiceImpl implements MenuService{
	@Resource(name="menudaoIBatis")
	private MenuDAO menuDAO;
//	@Resource(name="egovIdGnrService")
//	private EgovIdGnrService egovIdGnrService;
	

	@Override
	public void insertMenu(MenuVO vo) throws Exception {
//		vo.setId(egovIdGnrService.getNextStringId());
		menuDAO.insertMenu(vo);
		
	}

	@Override
	public void updateMenu(MenuVO vo) throws Exception {
		menuDAO.updateMenu(vo);
		
	}

	@Override
	public void deleteMenu(MenuVO vo) throws Exception {
		menuDAO.deleteMenu(vo);
		
	}

	@Override
	public MenuVO selectMenu(MenuVO vo) throws Exception {
		return menuDAO.selectMenu(vo);
	}

	@Override
	public List<MenuVO> selectMenuList(MenuVO vo) throws Exception {
		return menuDAO.selectMenuList(vo);
	}
}
