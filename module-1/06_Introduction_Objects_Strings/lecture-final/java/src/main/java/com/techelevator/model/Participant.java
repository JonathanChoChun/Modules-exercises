package com.techelevator.model;

import java.util.Objects;

public class Participant {
    private String name;
    private boolean isSharing;
    private boolean isRecording;
    private boolean isMuted;
    private boolean isSpeaking;
    private boolean hasVideoOn;

    public String getName() {
        if (name == null) {
            return "Not Provided";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSharing() {
        return isSharing;
    }

    public void setSharing(boolean sharing) {
        isSharing = sharing;
    }

    public boolean isRecording() {
        return isRecording;
    }

    public void setRecording(boolean recording) {
        isRecording = recording;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }

    public boolean isSpeaking() {
        return isSpeaking;
    }

    public boolean isHasVideoOn() {
        return hasVideoOn;
    }

    public void setHasVideoOn(boolean hasVideoOn) {
        this.hasVideoOn = hasVideoOn;
    }

    public Participant() {
    }

    public Participant(String name, boolean hasVideoOn) {
        this.name = name;
        this.hasVideoOn = hasVideoOn;
        this.isSharing = false;
        this.isMuted = true;
        this.isSpeaking = true;
    }

    @Override
    public String toString() {
        return "Participant = " + name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isSharing, isRecording, isMuted, isSpeaking, hasVideoOn);
    }
}
