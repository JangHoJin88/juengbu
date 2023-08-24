package egovframework.menu.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.menu.service.MenuDAO;
import egovframework.menu.service.MenuVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("menudaoIBatis")
public class MenuDAOIBatis extends EgovAbstractDAO implements MenuDAO {
	public MenuDAOIBatis() {
		System.out.println("menuIbatis");
	}

	@Override
	public void insertMenu(MenuVO vo) throws Exception {
		System.out.println("ibatis insert");
		insert("MenuDAO.insertMenu", vo);
	}

	@Override
	public void updateMenu(MenuVO vo) throws Exception {
		System.out.println("ibatis update");
		update("MenuDAO.updateMenu", vo);
	}

	@Override
	public void deleteMenu(MenuVO vo) throws Exception {
		System.out.println("ibatis delete");
		delete("MenuDAO.deleteMenu", vo);
	}

	@Override
	public MenuVO selectMenu(MenuVO vo) throws Exception {
		System.out.println("ibatis select");
		return (MenuVO) select("MenuDAO.selectMenu", vo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MenuVO> selectMenuList(MenuVO vo) throws Exception {
		System.out.println("ibatis selectList");
		return (List<MenuVO>) list("MenuDAO.selectMenuList", vo);
	}


}
