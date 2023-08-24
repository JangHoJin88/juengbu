package egovframework.menu.service;

import java.sql.Date;

public class MenuVO {
	private int mNo;
	private String id;
	private String mImage;
	private Date mUploadDate;
	private Date mUpdateDate;
	private int mYear;
	private int month;
	private int mLike;
	private String searchCondition;
	private String searchKeyword;
	
	public MenuVO() {
		
	}
	
	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getmImage() {
		return mImage;
	}
	public void setmImage(String mImage) {
		this.mImage = mImage;
	}
	public Date getmUploadDate() {
		return mUploadDate;
	}
	public void setmUploadDate(Date mUploadDate) {
		this.mUploadDate = mUploadDate;
	}
	public Date getmUpdateDate() {
		return mUpdateDate;
	}
	public void setmUpdateDate(Date mUpdateDate) {
		this.mUpdateDate = mUpdateDate;
	}
	public int getmYear() {
		return mYear;
	}
	public void setmYear(int mYear) {
		this.mYear = mYear;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getmLike() {
		return mLike;
	}
	public void setmLike(int mLike) {
		this.mLike = mLike;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
}
