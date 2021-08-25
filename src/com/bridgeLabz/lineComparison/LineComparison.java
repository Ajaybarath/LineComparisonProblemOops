package com.bridgeLabz.lineComparison;

public class LineComparison {
	
	public static void main(String args[]) {

		int x1 = 2;
		int x2 = 40;
		int y1 = 3;
		int y2 = 15;
		
		int x3 = 3;
		int x4 = 30;
		int y3 = 7;
		int y4 = 50;
		
		Integer lengthOfLine1 = (int) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		Integer lengthOfLine2 = (int) Math.sqrt(Math.pow((x4-x3), 2) + Math.pow((y4-y3), 2));
		
		System.out.println(lengthOfLine1);
		System.out.println(lengthOfLine2);

		if (lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("The lines are equal");
		}
		else {
			System.out.println("Lines are not equal");
		}
		
		
		int lineDifference = lengthOfLine1.compareTo(lengthOfLine2);
		
		if (lineDifference == 0) {
			System.out.println("Both the lines are equal");
		}
		else if(lineDifference > 0){
			System.out.println("Line 1 is greater");
		}
		else {
			System.out.println("Line 2 is greater");
		}
		
	}

}
