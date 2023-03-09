package com.qa.result;

public class Result {
	static int  physics=100;
	static int chemistry=100;
	static int biology=80;
	static double total;
	static double percentage;
	static double minPercentage = 60d;
	
	public static double displayResults(int phy, int chem, int bio) {
		System.out.println("Scores");
		System.out.println("Physics: "+ phy);
		System.out.println("Chemistry: "+ chem);
		System.out.println("Biology: " + bio);
		double totalScore = phy+chem+bio;
		System.out.println("Total Score: "+totalScore);
		return totalScore;
	}
	
	public static double findPercentage(double totalScore) {
		double maxTotalScore = 450;
		double percentageOfScores = 0;
		percentageOfScores = (totalScore/maxTotalScore)*100;
		System.out.println("Percentage = "+ percentageOfScores);
		if (percentageOfScores<minPercentage) {
			System.out.println("you have failed!!");
		}
		return percentageOfScores;
	}
	
	public static double findPercentageForSubject(double subjectScore) {
		double maxTotalScore = 150;
		double percentageOfScores = 0;
		percentageOfScores = (subjectScore/maxTotalScore)*100;
		//System.out.println("Percentage = "+ percentageOfScores);
		return percentageOfScores;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		total = displayResults(physics,chemistry,biology);
		percentage = findPercentage(total);
		double physicsPercentage = findPercentageForSubject(physics);
		double chemistryPercentage = findPercentageForSubject(chemistry);
		double biologyPercentage = findPercentageForSubject(biology);
		if (physicsPercentage<minPercentage) {
			System.out.println("you have failed Physics ");
		}
		else if (chemistryPercentage<minPercentage){
			System.out.println("you have failed Chemistry ");
		}
		else if (biologyPercentage<minPercentage) {
			System.out.println("you have failed Biology ");
		}

	}
	
	
}
