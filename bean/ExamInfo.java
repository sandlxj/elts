package com.ucai.elts.bean;

import java.io.Serializable;

public class ExamInfo implements Serializable {
/**
 *  "course":"android",
 "total":20,
 "time":10,
 "question":"android.json"
 */
	private String course;
	private int total;
	private int time;
	private String question;
	private User user;
	
	public ExamInfo(String course, int total, int time, String question,
			com.ucai.elts.bean.User user) {
		super();
		this.course = course;
		this.total = total;
		this.time = time;
		this.question = question;
		this.user = user;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		int id=1001;
		return "考试科目：" + this.course + "   考生编号：" + id + "\n"
				
				+"考题数量：" + this.total + "   考试时间：" + this.time + "分钟";
	}
	
}
