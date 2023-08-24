package egovframework.menu.service.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.menu.service.MenuService;
import egovframework.menu.service.MenuVO;

@Controller
@SessionAttributes("menu")
public class MenuController {
	@Resource(name="menuService")
	private MenuService menuService;
	

	@RequestMapping(value = "/insertMenu.do", method = RequestMethod.GET)
	public String insertMenuView(MenuVO vo) throws Exception {
		System.out.println("등록 화면으로 이동");

		return "insertMenu";
	}

	@RequestMapping(value = "/insertMenu.do", method = RequestMethod.POST)
	public String insertMenu(MenuVO vo) throws Exception {
		System.out.println("등록 처리");

		menuService.insertMenu(vo);
		return "redirect:selectMenuList.do";
	}

	@RequestMapping("/updateMenu.do")
	public String updateMenu(@ModelAttribute("Menu") MenuVO vo) throws Exception {
		System.out.println("수정");
		menuService.updateMenu(vo);
		return "forward:selectMenuList.do";
	}

	@RequestMapping("/deleteMenu.do")
	public String deleteMenu(MenuVO vo) throws Exception {
		System.out.println("삭제");
		menuService.deleteMenu(vo);
		return "forward:selectMenuList.do";
	}

//	 검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("연도", "mYear");
		conditionMap.put("월", "month");
		return conditionMap;
	}

	@RequestMapping("/selectMenu.do")
	public String selectMenu(MenuVO vo, Model model) throws Exception {
		System.out.println("상세 조회");

		model.addAttribute("Menu", menuService.selectMenu(vo));
		return "selectMenu";
	}

	@RequestMapping("/selectMenuList.do")
	public String selectMenuList(MenuVO vo, Model model) throws Exception {
		System.out.println("목록 조회 처리");
		// NULL check
		if (vo.getSearchCondition() == null)
			vo.setSearchCondition("mYear");
		if (vo.getSearchKeyword() == null)
			vo.setSearchKeyword("");
		model.addAttribute("menuList", menuService.selectMenuList(vo));
		return "selectMenuList";
	}

}
