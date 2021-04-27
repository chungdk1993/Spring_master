package com.donggun.springMaster.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 게시글 정보 VO
 * @author donggun.Chung
 * @since 2021.04.27.
 * @version 1.0
 */
public class PostVO {
	@NotNull @NotEmpty private String postNo;	// PK
	@NotNull @NotEmpty private String regId; 	// FK
	private String regDate;
	private String content;
	private int likeCnt;
	
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikeCnt() {
		return likeCnt;
	}
	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}
	
}
