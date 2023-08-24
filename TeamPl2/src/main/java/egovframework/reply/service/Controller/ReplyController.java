package egovframework.reply.service.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.product.service.ProductVO;
import egovframework.reply.service.ReplyService;
import egovframework.reply.service.ReplyVO;


@Controller
@SessionAttributes("reply")
public class ReplyController {

	@Resource(name="ReplyService")
	private ReplyService replyService;
	
	
	 @RequestMapping(value="insertReply.do",method=RequestMethod.GET) 
	 public String insertReplyView(ReplyVO vo) throws Exception{
		  replyService.insertReply(vo); 
		  return "selectCompl"; 
	  }
	 
	
	@RequestMapping(value="insertReply.do",method=RequestMethod.POST)
	public String insertReply(ReplyVO vo) throws Exception{
		replyService.insertReply(vo);
		return "forward:selectCompl.do";
	}
	
	@RequestMapping(value="updateReply.do")
	public String updateReply(ReplyVO vo) throws Exception{
		replyService.updateReply(vo);
		return "forward:selectComplList.do";
	}
	
	@RequestMapping(value="deleteReply.do")
	public String deleteReply(ReplyVO vo) throws Exception{
		replyService.deleteReply(vo);
		return "forward:selectComplList.do";
	}
//	@RequestMapping("selectCompl.do") 
//	public String selectReply(ReplyVO vo, Model model) throws Exception { 
//		System.out.println("특정 댓글 조회");
//		model.addAttribute("creply",replyService.selectReply(vo)); 
//	 	return "selectCompl"; 
//	 }
	 
	

}
