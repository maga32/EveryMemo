package com.project.everymemo.domain;

public class Memo {
	private int no;
	private String content;
	private MemoList memoList;
	
	public Memo() {}
	public Memo(int no, String content) {
		this.no = no;
		this.content = content;
	}
	
	public Memo(int no, String content, MemoList memoList) {
		this.no = no;
		this.content = content;
		this.memoList = memoList;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public MemoList getMemoList() {
		return memoList;
	}
	public void setMemoList(MemoList memoList) {
		this.memoList = memoList;
	}
}
