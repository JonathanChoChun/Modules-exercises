package com.techelevator;

public class Airplane {

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int bookedCoachSeats;
    private int totalCoachSeats;

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats(){
        return totalFirstClassSeats-bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats(){
        return totalCoachSeats-bookedCoachSeats;
    }
    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public Airplane(String planeNumber, int totalFirstClassSeats,int totalCoachSeats){
        this.planeNumber=planeNumber;
        this.totalCoachSeats=totalCoachSeats;
        this.totalFirstClassSeats=totalFirstClassSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        int currentBookedFirstCassSeats=bookedFirstClassSeats;
        int currentBookedCoachSeats=bookedCoachSeats;
        if (forFirstClass){
            currentBookedFirstCassSeats+=totalNumberOfSeats;
        }else{
            currentBookedCoachSeats+=totalNumberOfSeats;
        }
        if (currentBookedCoachSeats<=totalCoachSeats && currentBookedFirstCassSeats<=totalFirstClassSeats){
            bookedCoachSeats=currentBookedCoachSeats;
            bookedFirstClassSeats=currentBookedFirstCassSeats;
            return true;
        }else{return false;}
    }
}
