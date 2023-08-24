package egovframework.member.service;

import java.util.List;

public interface MemberDAO {
	String insertMember(MemberVO vo) throws Exception;
	void updateMember(MemberVO vo) throws Exception;
	void deleteMember(MemberVO vo) throws Exception;
	MemberVO selectMember(MemberVO vo)throws Exception;
	List<MemberVO> selectMemberList(MemberVO vo)throws Exception;
	int selectMemberIdCheck(String uid);
	int selectMemberCount(MemberVO vo);
}
