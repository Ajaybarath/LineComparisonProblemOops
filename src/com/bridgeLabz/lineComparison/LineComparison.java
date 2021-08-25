package com.bridgeLabz.lineComparison;


public class LineComparison {
	
	public static void main(String args[]) {
		
		Line line1 = new Line(2,4,8,5);
		Line line2 = new Line(4,1,6,15);
		
		System.out.println("Length of line 1 is " + line1.length());
		
		System.out.println("Length of line 2 is " + line2.length());

		lineDifference(line1.length(), line2.length());
		
		lineComparator(line1.length(), line2.length());
		
	}
	
	public static void lineDifference(Integer lengthOfLine1, Integer lengthOfLine2) {
				
		if (lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("The lines are equal");
		}
		else {
			System.out.println("Lines are not equal");
		}
	}
	
	
	public static void lineComparator(Integer lengthOfLine1, Integer lengthOfLine2) {
		
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

class Line {
	
	int x1, x2, y1, y2;
	
	Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public Integer length() {
		int lengthOfLine = (int) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		return lengthOfLine;
	}
	

}
