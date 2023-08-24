package egovframework.compl.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.compl.service.ComplDAO;
import egovframework.compl.service.ComplVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;


@Repository("daoIBatis")
public class ComplDAOIBatis extends EgovAbstractDAO implements ComplDAO {

	public ComplDAOIBatis() {
		System.out.println("[ComplDAOIBatis() 생성]");
	}
	
	public void insertCompl(ComplVO vo) throws Exception{
		insert("ComplDAO.insertCompl",vo);
	}
	
	public void updateCompl(ComplVO vo) throws Exception{
		update("ComplDAO.updateCompl",vo);
	}
	
	public void deleteCompl(ComplVO vo) throws Exception{
		delete("ComplDAO.deleteCompl",vo);
	}
	
	public ComplVO selectCompl(ComplVO vo) throws Exception{
		return (ComplVO) select("ComplDAO.selectCompl",vo);
	}
	
	public List<ComplVO> selectComplList(ComplVO vo) throws Exception{
		return (List<ComplVO>) list("ComplDAO.selectComplList",vo);
	}

	public void viewCount(int cNo) throws Exception {
		update("ComplDAO.viewCount",cNo);
	}

}
