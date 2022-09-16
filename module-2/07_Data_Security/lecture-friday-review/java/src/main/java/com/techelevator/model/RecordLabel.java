package com.techelevator.model;

import java.util.Date;

public class RecordLabel {
    private long recordLabelId;
    private String labelName;
    private String url;
    private Date foundedDate;

    public RecordLabel() {
    }

    public long getRecordLabelId() {
        return recordLabelId;
    }

    public void setRecordLabelId(long recordLabelId) {
        this.recordLabelId = recordLabelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
    }

    @Override
    public String toString() {
        return "RecordLabel{" +
                "recordLabelId=" + recordLabelId +
                ", labelName='" + labelName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
