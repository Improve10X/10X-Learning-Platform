package com.improve10x.learningplatform.homecourses.model;

public class Course {

    private String dayNumber;
    private String releasingDate;
    private String subTitle;
    private String description;
    private String message;

    public String getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(String dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getReleasingDate() {
        return releasingDate;
    }

    public void setReleasingDate(String releasingDate) {
        this.releasingDate = releasingDate;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
