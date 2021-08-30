package com.bridgeLabz.lineComparison;


public class LineComparisonMain {
	
	public static void main(String args[]) {
		
		Line line1 = new Line(2,4,8,15);
		Line line2 = new Line(4,1,6,5);
		
		LineLengthFinder lineLengthFinder = new LineLengthFinderImpl();
		LineComparator lineComparator = new LineComparatorImpl();

		Integer lengthOfLine1 = lineLengthFinder.getLength(line1);
		Integer lengthOfLine2 = lineLengthFinder.getLength(line2);

		
		System.out.println("Length of line 1 is " + lengthOfLine1);
		
		System.out.println("Length of line 2 is " + lengthOfLine2);

		lineComparator.compareLines(line1, line2);
		
	}
	
}
