package com.techelevator.dao;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class NotificationSignupDao {

	private PrintWriter writer;

	public NotificationSignupDao(OutputStream outputDestination) {
		this.writer = new PrintWriter(outputDestination, true);
	}

	public void saveNotificationSignup(String firstName, String lastName, int age, String emailAddress) {
		LocalDateTime now = LocalDateTime.now();
		writer.println(now + "|" + lastName + ", " + firstName + "|" + age + "|" + emailAddress);
	}
}
