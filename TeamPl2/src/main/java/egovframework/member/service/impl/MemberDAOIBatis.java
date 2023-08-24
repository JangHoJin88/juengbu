package egovframework.member.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.member.service.MemberDAO;
import egovframework.member.service.MemberVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("MemberIBatis")
public class MemberDAOIBatis extends  EgovAbstractDAO implements MemberDAO{
	
	public MemberDAOIBatis() {
		System.out.println("MemberIBatis생성자");
	}
	@Override
	public String insertMember(MemberVO mvo) throws Exception {
		return (String) insert("MemberDAO.insertMember",mvo);
	}

	@Override
	public void updateMember(MemberVO mvo) throws Exception {
		update("MemberDAO.updateMember",mvo);
	}

	@Override
	public void deleteMember(MemberVO mvo) throws Exception {
		delete("MemberDAO.deleteMember",mvo);
	}

	@Override
	public MemberVO selectMember(MemberVO mvo) throws Exception {
		return (MemberVO)select("MemberDAO.selectMember",mvo);
	}

	@Override
	public List<MemberVO> selectMemberList(MemberVO mvo) throws Exception {
		return (List<MemberVO>) list("MemberDAO.selectMemberList",mvo);
	}
	
	
	@Override
	public int selectMemberIdCheck(String uid) {
		return (int)select("MemberDAO.selectMemberIdCheck",uid);
	}
	@Override
	public int selectMemberCount(MemberVO vo) {
		return (int)select("MemberDAO.selectMemberCount",vo);
		
	}
}
