package com.bidgelab.objectoriented;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RegexMain {
	// main method of Regex class
	public static void main(String[] args) throws IOException {
		Details detail = new Details();
		RegexChange change = new RegexChange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		detail.setName(scanner.next());
		System.out.println("Enter your full name");
		String fullname = scanner.nextLine();
		fullname += scanner.nextLine();
		detail.setFullname(fullname);
		System.out.println("Enter your contact No");
		detail.setContactNo(scanner.next());
		scanner.close();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date(22 / 2 / 2019);
		detail.setDate((formatter.format(date)));
		BufferedReader reader = new BufferedReader(
				new FileReader("E:\\Programs\\BridgeLabz\\src\\com\\bidgelab\\objectoriented\\Regection"));
		String line;
		StringBuilder builder = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			builder.append(line);
		}
		reader.close();
		line = builder.toString();
		System.out.print(change.convertString(detail, line));

	}

}
