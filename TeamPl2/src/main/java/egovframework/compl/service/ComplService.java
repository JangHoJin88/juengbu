package egovframework.compl.service;

import java.util.List;

public interface ComplService {

	void insertCompl(ComplVO vo) throws Exception;
	
	void updateCompl(ComplVO vo) throws Exception;
	
	void deleteCompl(ComplVO vo) throws Exception;

	ComplVO selectCompl(ComplVO vo) throws Exception;
	
	List<ComplVO> selectComplList(ComplVO vo) throws Exception;
	
	void viewCount(int cNo) throws Exception;

}