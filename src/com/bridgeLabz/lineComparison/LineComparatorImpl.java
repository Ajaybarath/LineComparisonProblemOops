package com.bridgeLabz.lineComparison;

public class LineComparatorImpl implements LineComparator {
	
	LineLengthFinder lineLengthFinder = new LineLengthFinderImpl();

	public void compareLines(Line line1, Line line2) {
		
		Integer lengthOfLine1 = lineLengthFinder.getLength(line1);
		Integer lengthOfLine2 = lineLengthFinder.getLength(line2);

		int lineDifference = lengthOfLine1.compareTo(lengthOfLine2);

		if (lineDifference == 0) {
			System.out.println("Both the lines are equal");
		} else if (lineDifference > 0) {
			System.out.println("Line 1 is greater");
		} else {
			System.out.println("Line 2 is greater");
		}

	}

}
