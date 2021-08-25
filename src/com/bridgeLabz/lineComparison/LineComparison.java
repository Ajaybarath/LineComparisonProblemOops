package com.bridgeLabz.lineComparison;

public class LineComparison {
	
	public static void main(String args[]) {

		int x1 = 2;
		int x2 = 4;
		int y1 = 3;
		int y2 = 5;
		
		int lengthOfLine = (int) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println("The line length is " + lengthOfLine);
			
	}

}
