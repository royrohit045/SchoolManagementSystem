package org.jsp.student.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	
	private long phonNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public long getPhonNo() {
		return phonNo;
	}
	public void setPhonNo(long phonNo) {
		this.phonNo = phonNo;
	}
	public int getLanguage1() {
		return language1;
	}
	public void setLanguage1(int language1) {
		this.language1 = language1;
	}
	public int getLanguage2() {
		return language2;
	}
	public void setLanguage2(int language2) {
		this.language2 = language2;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getGeography() {
		return geography;
	}
	public void setGeography(int geography) {
		this.geography = geography;
	}
	public int getMathematics() {
		return mathematics;
	}
	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getLifeSince() {
		return lifeSince;
	}
	public void setLifeSince(int lifeSince) {
		this.lifeSince = lifeSince;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	private int language1;
	private int language2;
	private int history;
	private int geography;
	private int mathematics;
	private int physics;
	private int chemistry;
	private int lifeSince;
	private int totalMarks;
	@Override
	public String toString() {
		return "Student [id=" + id +", name=" + name + ", Studentclass="  + ", phonNo=" + phonNo
				+ ", language1=" + language1 + ", language2=" + language2 + ", history=" + history + ", geography="
				+ geography + ", mathematics=" + mathematics + ", physics=" + physics + ", chemistry=" + chemistry
				+ ", lifeSince=" + lifeSince + ", totalMarks=" + totalMarks + ", percentage=" + percentage + "]";
	}
	private double percentage;
}
