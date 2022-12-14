package mit.c301.nf4.vo;

import java.util.Date;

public class SigninVO {
	
	private String id;
	private String name;
	private String pw;
	private String email;
	private Date birth;
	private Integer gender;
	private String tel;
	private String address;
	private String h_answer;
	private Integer ran_count;
	private Integer hint_h_no;
	private String auth;
	
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getH_answer() {
		return h_answer;
	}
	public void setH_answer(String h_answer) {
		this.h_answer = h_answer;
	}
	public Integer getRan_count() {
		return ran_count;
	}
	public void setRan_count(Integer ran_count) {
		this.ran_count = ran_count;
	}
	public Integer getHint_h_no() {
		return hint_h_no;
	}
	public void setHint_h_no(Integer hint_h_no) {
		this.hint_h_no = hint_h_no;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	
	

}
