package com.tutorialspoint;

public class Bucket {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Integer paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public Integer getGoalAmount() {
		return goalAmount;
	}
	public void setGoalAmount(Integer goalAmount) {
		this.goalAmount = goalAmount;
	}
	private String name;
	private Integer paymentAmount;
	private Integer goalAmount;
}
