package com.personalProject;

public class Bucket {
	private String name;
	private int paymentAmount;
	private int currentAmount;
	private int goalAmount;
	private int newAmount;

	public int getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public int getGoalAmount() {
		return goalAmount;
	}

	public void setGoalAmount(int goalAmount) {
		this.goalAmount = goalAmount;
	}
	
	public int getNewAmount() {
		newAmount = currentAmount + paymentAmount;
		return newAmount;
	}
}
