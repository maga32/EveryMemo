package com.project.everymemo.domain;

import java.sql.Timestamp;

public class MemoModify {
	private int no;
	private String id;
	private String moContent;
	private Timestamp moDate;
	private Memo memo;
	
	public MemoModify() {}
	public MemoModify(int no, String id, String moContent, Timestamp moDate) {
		this.no = no;
		this.id = id;
		this.moContent = moContent;
		this.moDate = moDate;
	}
	
	public MemoModify(int no, String id, String moContent, Timestamp moDate, Memo memo) {
		this.no = no;
		this.id = id;
		this.moContent = moContent;
		this.moDate = moDate;
		this.memo = memo;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMoContent() {
		return moContent;
	}
	public void setMoContent(String moContent) {
		this.moContent = moContent;
	}
	public Timestamp getMoDate() {
		return moDate;
	}
	public void setMoDate(Timestamp moDate) {
		this.moDate = moDate;
	}
	
	public Memo getMemo() {
		return memo;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
}
