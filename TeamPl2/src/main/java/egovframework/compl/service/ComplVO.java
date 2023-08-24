package egovframework.compl.service;

import java.sql.Date;

public class ComplVO {

	private int cNo;
	private String cTitle;
	private String cWriter;
	private String cContent;
	private int view;
	private Date cUploadDate;
	private boolean secret;
	
	private int viewPage=1; 
	private int startIndex=1;
	private int endIndex=10;
	
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public String getcTitle() {
		return cTitle;
	}
	public void setcTitle(String cTitle) {
		this.cTitle = cTitle;
	}
	public String getcWriter() {
		return cWriter;
	}
	public void setcWriter(String cWriter) {
		this.cWriter = cWriter;
	}
	public String getcContent() {
		return cContent;
	}
	public void setcContent(String cContent) {
		this.cContent = cContent;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public Date getcUploadDate() {
		return cUploadDate;
	}
	public void setcUploadDate(Date cUploadDate) {
		this.cUploadDate = cUploadDate;
	}
	
	public boolean isSecret() {
		return secret;
	}
	public void setSecret(boolean secret) {
		this.secret = secret;
	}
	
	
	
}
