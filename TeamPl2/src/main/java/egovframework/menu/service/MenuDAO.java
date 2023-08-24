package egovframework.menu.service;

import java.util.List;

public interface MenuDAO {
	
	void insertMenu(MenuVO vo) throws Exception;
	
	void updateMenu(MenuVO vo) throws Exception;
	
	void deleteMenu(MenuVO vo) throws Exception;
	
	MenuVO selectMenu(MenuVO vo) throws Exception;
	
	List<MenuVO> selectMenuList(MenuVO vo) throws Exception;

}
