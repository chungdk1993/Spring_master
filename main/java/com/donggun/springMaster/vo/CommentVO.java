package com.donggun.springMaster.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 댓글 정보 VO
 * @author donggun.Chung
 * @since 2021.04.27.
 * @version 1.0 
 */
@Entity
@Table(name="COMMENT")
public class CommentVO {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private String commentNo;	// PK
	@NotNull @NotEmpty private String regId;
	@NotNull @NotEmpty @Size(min=1, max=1000) private String content;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;
	
	@ManyToOne
	@JoinColumn(name="BOARD_NO")
	private BoardVO board;
	
	public String getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(String commentNo) {
		this.commentNo = commentNo;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public BoardVO getBoard() {
		return board;
	}
	public void setBoard(BoardVO board) {
		this.board = board;
		board.getCommentList().add(this);
	}
	
}
