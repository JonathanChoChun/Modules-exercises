package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade(){
        double fractionMarks= (double)earnedMarks/(double) possibleMarks;
        double percentageMarks= fractionMarks *100;
        if (percentageMarks>=90){
            return "A";
        }else if (89>=percentageMarks&&percentageMarks>=80){
            return "B";
        }else if (79>=percentageMarks&&percentageMarks>=70){
            return "C";
        }
        else if (69>=percentageMarks&&percentageMarks>=60){
            return "D";
        }else{return "F";}
    };

    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks=possibleMarks;
        this.submitterName=submitterName;
    }
}
