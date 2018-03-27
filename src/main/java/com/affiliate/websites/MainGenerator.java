package com.affiliate.websites;

public class MainGenerator {
	public static void main(String[] args) {
		for (long i = 102; i <= 10000; i++) {
			System.out.println("INSERT INTO \"public\".\"websites\" "
					+ "(\"id\", \"title\", \"url\", \"image\", \"description\", \"prettyname\") " + "VALUES (E'" + i
					+ "', E'in faucibus', E'http://www.gsp.ro', E'./src/assets/gsp.png', "
					+ "E'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Curabitur sed', "
					+ "E'gazeta-sporturilor');");
		}
	}
}
