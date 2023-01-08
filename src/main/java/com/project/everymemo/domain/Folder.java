package com.project.everymemo.domain;

import java.sql.Timestamp;

public class Folder {
	private int no;
	private String id;
	private String name;
	private Timestamp date;
	private String cover;
	private int sharedFolder;
	private String folderLink;
	private int orderFolder;
	
	public Folder() {}
	public Folder(int no, String id, String name, Timestamp date, String cover, int sharedFolder, String folderLink, int orderFolder) {
		this.no = no;
		this.id = id;
		this.name = name;
		this.date = date;
		this.cover = cover;
		this.sharedFolder = sharedFolder;
		this.folderLink = folderLink;
		this.orderFolder = orderFolder;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public int getSharedFolder() {
		return sharedFolder;
	}
	public void setSharedFolder(int sharedFolder) {
		this.sharedFolder = sharedFolder;
	}
	public String getFolderLink() {
		return folderLink;
	}
	public void setFolderLink(String folderLink) {
		this.folderLink = folderLink;
	}
	public int getOrderFolder() {
		return orderFolder;
	}
	public void setOrderFolder(int orderFolder) {
		this.orderFolder = orderFolder;
	}
}
