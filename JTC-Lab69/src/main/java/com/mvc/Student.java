package com.mvc;

import java.util.Arrays;

public class Student {
	private String sid;
	private String sname;
	private String phone;
	private String email;
	private String[] timings;
	private String qualification;
	private String gender;
	private String remarks;
	{
		System.out.println("ib in Student");
	}

	// Setters and Getters
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getTimings() {
		return timings;
	}

	public void setTimings(String[] timings) {
		this.timings = timings;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", phone=" + phone + ", email=" + email + ", timings="
				+ Arrays.toString(timings) + ", qualification=" + qualification + ", gender=" + gender + ", remarks="
				+ remarks + "]";
	}

}
