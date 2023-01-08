package com.project.everymemo.domain;

import java.sql.Timestamp;

public class MemoList {
	private int no;
	private String id;
	private int folderNo;
	private String preview;
	private String thumbnail;
	private Timestamp writeDate;
	private Timestamp editDate;
	private Timestamp delDate;
	private int fixed;
	private int sharedMemo;
	private String memoLink;
	private int readonly;
	private int favorite;
	private int locked;
	private String password;
	
	public MemoList() {}
	public MemoList(int no, String id, int folderNo, String preview, String thumbnail,Timestamp writeDate, Timestamp editDate,
			Timestamp delDate, int fixed, int sharedMemo, String memoLink, int readonly, int favorite, int locked, String password) {
		this.no = no;
		this.id = id;
		this.folderNo = folderNo;
		this.preview = preview;
		this.thumbnail = thumbnail;
		this.writeDate = writeDate;
		this.editDate = editDate;
		this.delDate = delDate;
		this.fixed = fixed;
		this.sharedMemo = sharedMemo;
		this.memoLink = memoLink;
		this.readonly = readonly;
		this.favorite = favorite;
		this.locked = locked;
		this.password = password;
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
	public int getFolderNo() {
		return folderNo;
	}
	public void setFolderNo(int folderNo) {
		this.folderNo = folderNo;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Timestamp getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	public Timestamp getEditDate() {
		return editDate;
	}
	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}
	public Timestamp getDelDate() {
		return delDate;
	}
	public void setDelDate(Timestamp delDate) {
		this.delDate = delDate;
	}
	public int getFixed() {
		return fixed;
	}
	public void setFixed(int fixed) {
		this.fixed = fixed;
	}
	public int getSharedMemo() {
		return sharedMemo;
	}
	public void setSharedMemo(int sharedMemo) {
		this.sharedMemo = sharedMemo;
	}
	public String getMemoLink() {
		return memoLink;
	}
	public void setMemoLink(String memoLink) {
		this.memoLink = memoLink;
	}
	public int getReadonly() {
		return readonly;
	}
	public void setReadonly(int readonly) {
		this.readonly = readonly;
	}
	public int getFavorite() {
		return favorite;
	}
	public void setFavorite(int favorite) {
		this.favorite = favorite;
	}
	public int getLocked() {
		return locked;
	}
	public void setLocked(int locked) {
		this.locked = locked;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}