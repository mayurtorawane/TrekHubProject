package com.example.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int login_id;
	
	String uid;
	String pwd;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	Role role_id;
	
	

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String uid, String pwd, Role role_id) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.role_id = role_id;
	}

	public Login(int login_id, String uid, String pwd, Role role_id) {
		super();
		this.login_id = login_id;
		this.uid = uid;
		this.pwd = pwd;
		this.role_id = role_id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Role getRole_id() {
		return role_id;
	}

	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	@Override
	public String toString() {
		return "Login [login_id=" + login_id + ", uid=" + uid + ", pwd=" + pwd + ", role_id=" + role_id + "]";
	}
	
}

