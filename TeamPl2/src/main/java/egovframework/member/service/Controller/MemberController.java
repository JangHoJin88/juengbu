package egovframework.member.service.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.member.service.MemberService;
import egovframework.member.service.MemberVO;

@Controller
@SessionAttributes("member")
public class MemberController {
	@Resource(name="memberService")
	private MemberService memberService;
	
	@RequestMapping(value="/insertMember.do",method=RequestMethod.GET)
	public String insertMemberView(MemberVO vo) throws Exception{
		System.out.println("회원가입 화면 이동");
		return "insertMember";
	}
	@RequestMapping(value="/insertMember.do",method=RequestMethod.POST)
	@ResponseBody
	public String insertMember(MemberVO vo)throws Exception{
		System.out.println("회원 등록중");
		String message="";
		String result=memberService.insertMember(vo);
		if(result==null) {
			message="ok";
		}
		return message;
	}
	
	@RequestMapping("/idcheck.do")
	@ResponseBody
	public String selectMemberIdCheck(String uid)throws Exception{
		
		String message="";
		int count=memberService.selectMemberIdCheck(uid);//중복된 데이터
		if(count==0) {
			message="ok";
		}
		return message;
	}
	
	
	/*
	 * @RequestMapping(value="/updateMember.do",method=RequestMethod.GET) public
	 * String updateMemberView(MemberVO vo)throws Exception{
	 * System.out.println("회원 수정페이지 이동"); //
	 * model.addAttribute("member",memberService.selectMember(vo)); return
	 * "updateMember"; }
	 */
	@RequestMapping("updateMember.do")
	public String updateMember(MemberVO vo)throws Exception{
		System.out.println("회원 수정완료");
		memberService.updateMember(vo);
		return "forward:index2.do";
	}
	@RequestMapping("deleteMember.do")
	public String deleteMember(MemberVO vo)throws Exception{
		System.out.println("회원삭제 완료");
		memberService.deleteMember(vo);
		return "forward:index3.do";
	}
	@RequestMapping("selectMember.do")
	public String selectMember(MemberVO vo ,Model model)throws Exception{
		System.out.println("회원수정");
		model.addAttribute("member1",memberService.selectMember(vo));
		System.out.println(model);
		return"updateMember";
	}
	@RequestMapping("ListMember.do")
	public String ListMember(MemberVO vo, Model model)throws Exception{
		System.out.println("회원들 보자");
		model.addAttribute("memberList",memberService.selectMemberList(vo));
		return "ListMember";
	}
	
	@RequestMapping("loginWrite.do")
	public String loginWrite(){
		return "loginWrite";
	}
	
	@RequestMapping("loginWriteSub.do")
	@ResponseBody
	public String loginProcessing(MemberVO vo,HttpSession session) throws Exception{
		MemberVO info=(MemberVO)memberService.selectMember(vo);
		String message="";
		int count = memberService.selectMemberCount(vo);
		if(count==1) {
			//세션 생성
			session.setAttribute("SessionUserId",info.getUid() );
			session.setAttribute("SessionUserName",info.getName() );
			System.out.println(info.getName());
			//메시지처리
			message="ok";
		}
		
		return message;
	}
	@RequestMapping("logout.do")
	public String logout(HttpSession session){
		session.removeAttribute("SessionUserId");
		session.removeAttribute("SessionUserName");
		
		return "loginWrite";
	}
	
	@RequestMapping("homePage.do")
	public String homePage(){
		return "homePage";
	}
	
	
	@RequestMapping("index.do")
	public String index(){
		return "index";
	}
	@RequestMapping("index2.do")
	public String index2(){
		return "index2";
	}
	@RequestMapping("index3.do")
	public String index3(){
		return "index3";
	}
	@RequestMapping("test.do")
	public String test() {
		return "test";
	}
}
