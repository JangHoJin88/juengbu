package egovframework.compl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.compl.service.ComplDAO;
import egovframework.compl.service.ComplService;
import egovframework.compl.service.ComplVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("ComplService")
public class ComplServiceImpl extends EgovAbstractServiceImpl implements ComplService {

	@Resource(name="daoIBatis")
	private ComplDAO complDAO;
	
	public void insertCompl(ComplVO vo) throws Exception{
		complDAO.insertCompl(vo);
	}
	
	public void updateCompl(ComplVO vo) throws Exception{
		complDAO.updateCompl(vo);
	}
	
	public void deleteCompl(ComplVO vo) throws Exception{
		complDAO.deleteCompl(vo);
	}
	
	public ComplVO selectCompl(ComplVO vo) throws Exception{
		return complDAO.selectCompl(vo);
	}
	
	public List<ComplVO> selectComplList(ComplVO vo) throws Exception{
		return complDAO.selectComplList(vo);
	}
	
	public void viewCount(int cNo) throws Exception{
		complDAO.viewCount(cNo);
	}

}
