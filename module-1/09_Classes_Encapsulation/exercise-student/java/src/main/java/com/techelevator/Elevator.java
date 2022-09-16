package com.techelevator;

public class Elevator {

    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public Elevator(int numberOfLevels){
        numberOfFloors=numberOfLevels;
        currentFloor=1;
    }
    public void openDoor(){doorOpen=true;}
    public void closeDoor(){doorOpen=false;}
    public void goUp(int desiredFloor){
        if(!doorOpen){
            if(currentFloor<numberOfFloors){
            currentFloor+=1;}

        }
    }
    public void goDown(int desiredFloor){
        if(!doorOpen){
            if(currentFloor>1){
                currentFloor-=1;}

        }
    }

}
