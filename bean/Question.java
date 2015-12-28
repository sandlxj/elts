package com.ucai.elts.bean;

import java.io.Serializable;

public class Question implements Serializable {
/**
 *  "title":"1.���ڵ�һ������ͨѶ����˵����ȷ����___",
 "optiona":"A.���1G��1994�����",
 "optionb":"B.ģ����ʽ�ֻ�",
 "optionc":"C.�ṩ����������ҵ��",
 "optiond":"D.ͨ��Ч����������ܲ��ã��û��Ľ�����Χ����",
 "answer":"BCD",
 "score":2,
 "level":1
 */
	private String title;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private String answer;
	private int score;
	private int level;
	private String UserAnwser;
	
	
	public Question(String title, String optiona, String optionb,
			String optionc, String optiond, String answer, int score,
			int level, String userAnwser) {
		super();
		this.title = title;
		this.optiona = optiona;
		this.optionb = optionb;
		this.optionc = optionc;
		this.optiond = optiond;
		this.answer = answer;
		this.score = score;
		this.level = level;
		UserAnwser = userAnwser;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOptiona() {
		return optiona;
	}
	public void setOptiona(String optiona) {
		this.optiona = optiona;
	}
	public String getOptionb() {
		return optionb;
	}
	public void setOptionb(String optionb) {
		this.optionb = optionb;
	}
	public String getOptionc() {
		return optionc;
	}
	public void setOptionc(String optionc) {
		this.optionc = optionc;
	}
	public String getOptiond() {
		return optiond;
	}
	public void setOptiond(String optiond) {
		this.optiond = optiond;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getUserAnwser() {
		return UserAnwser;
	}
	public void setUserAnwser(String userAnwser) {
		UserAnwser = userAnwser;
	}
	@Override
	public String toString() {
		return  this.title + "\n" 
				+ this.optiona+"\n"
				+ this.optionb+"\n"
				+ this.optionc+"\n"
				+ this.optiond;
	}
	
}
