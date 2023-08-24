package egovframework.reply.service;

import java.sql.Date;

public class ReplyVO {

	private String rcontent;
	private Date rUpLoadDate;
	private String rWriter;
	private int cNo;
	
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public Date getrUpLoadDate() {
		return rUpLoadDate;
	}
	public void setrUpLoadDate(Date rUpLoadDate) {
		this.rUpLoadDate = rUpLoadDate;
	}
	public String getrWriter() {
		return rWriter;
	}
	public void setrWriter(String rWriter) {
		this.rWriter = rWriter;
	}
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	
	
}
