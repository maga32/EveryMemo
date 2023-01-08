package com.project.everymemo.domain;

import java.sql.Timestamp;

public class Member {
	private String id;
	private String password;
	private String nickname;
	private String photo;
	private String email;
	private Timestamp joinDate;
	private Timestamp delDate;
	private Timestamp proDate;
	private Timestamp punishDate;
	private String level;
	
	public Member() {}
	public Member(String id, String password, String nickname, String photo, String email,
			Timestamp joinDate, Timestamp delDate, Timestamp proDate, Timestamp punishDate, String level) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.photo = photo;
		this.email = email;
		this.joinDate = joinDate;
		this.delDate = delDate;
		this.proDate = proDate;
		this.punishDate = punishDate;
		this.level = level;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}
	public Timestamp getDelDate() {
		return delDate;
	}
	public void setDelDate(Timestamp delDate) {
		this.delDate = delDate;
	}
	public Timestamp getProDate() {
		return proDate;
	}
	public void setProDate(Timestamp proDate) {
		this.proDate = proDate;
	}
	public Timestamp getPunishDate() {
		return punishDate;
	}
	public void setPunishDate(Timestamp punishDate) {
		this.punishDate = punishDate;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
