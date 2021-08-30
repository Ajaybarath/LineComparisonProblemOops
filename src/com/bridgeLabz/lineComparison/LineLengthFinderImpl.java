package com.bridgeLabz.lineComparison;

public class LineLengthFinderImpl implements LineLengthFinder {
	
	public int getLength(Line line) {
		
		int lengthOfLine = (int) Math.sqrt(Math.pow((line.getX2() - line.getX1()), 2) + Math.pow((line.getY2() - line.getY1()), 2));

		return lengthOfLine;
		
	}

}
