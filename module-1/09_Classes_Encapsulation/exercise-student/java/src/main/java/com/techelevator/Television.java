package com.techelevator;

public class Television {

    boolean isOn =false;
    int currentChannel=3;
    int currentVolume=2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff(){isOn=false;};
    public void turnOn(){isOn=true;};
    public void changeChannel(int newChannel){if(isOn){currentChannel=newChannel;};};
    public void channelUp(){
        if(isOn){
            if(currentChannel>=18){
                currentChannel=3;}
            else{
                currentChannel+=1;}
        }
    };
    public void channelDown(){
        if(isOn){
            if(currentChannel<=3){
                currentChannel=18;}
            else{
                currentChannel-=1;}
        }
    };
    public void raiseVolume(){
        if(isOn) {
            if (currentVolume == 10) {
                currentVolume = 10;
            } else {
                currentVolume += 1;
            }
        }
    };

    public void lowerVolume(){
        if(isOn) {
            if (currentVolume == 0) {
                currentVolume = 0;
            } else {
                currentVolume -= 1;
            }
        }
    };


}
