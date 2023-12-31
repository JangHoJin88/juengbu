package egovframework.member.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.member.service.MemberDAO;
import egovframework.member.service.MemberService;
import egovframework.member.service.MemberVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("memberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService{
	@Resource(name="MemberIBatis")
	private MemberDAO memberDAO;
	
	public MemberServiceImpl() {
		System.out.println("MemberServiceImpl");
	}

	@Override
	public String insertMember(MemberVO mvo) throws Exception {
		return memberDAO.insertMember(mvo);
	}
		
	@Override
	public void updateMember(MemberVO mvo) throws Exception {
		memberDAO.updateMember(mvo);
	}

	@Override
	public void deleteMember(MemberVO mvo) throws Exception {
		memberDAO.deleteMember(mvo);
	}

	@Override
	public MemberVO selectMember(MemberVO mvo) throws Exception {
		return memberDAO.selectMember(mvo);
	}

	@Override
	public List<MemberVO> selectMemberList(MemberVO mvo) throws Exception {
		return memberDAO.selectMemberList(mvo);
	}

	//중복아이디체크
	@Override
	public int selectMemberIdCheck(String uid) throws Exception {
		return memberDAO.selectMemberIdCheck(uid);
	}
	
	//로그인 결과
	@Override
	public int selectMemberCount(MemberVO vo) throws Exception {
		return memberDAO.selectMemberCount(vo);
	}
	
	
}
