package com.week3and4.tauber.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends People {
    private Boolean approved;
    private String course;
    private Integer media;

    private List<Integer> exams = new ArrayList<>();

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }

    public List getExams() {
        return exams;
    }

    public void setExams(List exams) {
        this.exams = exams;
    }
}
