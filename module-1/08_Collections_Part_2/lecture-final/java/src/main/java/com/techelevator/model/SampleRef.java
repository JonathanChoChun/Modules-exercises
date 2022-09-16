package com.techelevator.model;

public class SampleRef {
    private int intValue;
    private boolean boolValue;

    public SampleRef(int intValue, boolean boolValue) {
        this.intValue = intValue;
        this.boolValue = boolValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public boolean isBoolValue() {
        return boolValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }
}
