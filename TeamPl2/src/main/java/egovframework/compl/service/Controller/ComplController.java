package egovframework.compl.service.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.compl.service.ComplService;
import egovframework.compl.service.ComplVO;
import egovframework.reply.service.ReplyService;
import egovframework.reply.service.ReplyVO;


@Controller
@SessionAttributes("compl")
public class ComplController {

	@Resource(name="ComplService")
	private ComplService complService;
	
	@Resource(name="ReplyService")
	private ReplyService replyService;
	
	@RequestMapping(value="insertCompl.do",method=RequestMethod.GET)
	public String insertComplView(ComplVO vo) throws Exception{
		return "insertCompl";
	}
	
	@RequestMapping(value="insertCompl.do",method=RequestMethod.POST)
	public String insertCompl(ComplVO vo) throws Exception{
		//for(int i=1;i<100;i++) {
		complService.insertCompl(vo);
		//}
		return "forward:selectComplList.do";
	}
	
	@RequestMapping(value="updateCompl.do",method=RequestMethod.GET)
	public String updateComplView(@ModelAttribute("compl")ComplVO vo,Model model) throws Exception{
		model.addAttribute("compl", complService.selectCompl(vo));
		return "updateCompl";
	}
	
	@RequestMapping(value="updateCompl.do",method=RequestMethod.POST)
	public String updateCompl(@ModelAttribute("compl")ComplVO vo) throws Exception{
		complService.updateCompl(vo);
		return "forward:selectComplList.do";
	}
	
	@RequestMapping(value="deleteCompl.do")
	public String deleteCompl(ComplVO vo) throws Exception{
		complService.deleteCompl(vo);
		return "forward:selectComplList.do";
	}
	
	@RequestMapping(value="selectCompl.do")
	public String selectCompl(ComplVO vo,ReplyVO vo2,Model model,Model model2) throws Exception{
		complService.viewCount(vo.getcNo());
		model.addAttribute("compl", complService.selectCompl(vo));
		model2.addAttribute("creply",replyService.selectReply(vo2));
		//System.out.println(model2);
		return "selectCompl";
	}
	
	@RequestMapping(value="selectComplList.do")
	public String selectComplList(ComplVO vo,ReplyVO vo2,Model model,Model model2) throws Exception{
		model.addAttribute("complList", complService.selectComplList(vo));
		model2.addAttribute("creplyList",replyService.selectReplyList(vo2));
		//System.out.println(model2);
		return "selectComplList";
	}
	
}
