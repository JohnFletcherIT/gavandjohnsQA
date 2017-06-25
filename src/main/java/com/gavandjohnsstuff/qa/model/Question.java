package com.gavandjohnsstuff.qa.model;


import java.util.Date;
import java.util.List;

public class Question {
    private String title;
    private int score;
    private Date dateSubmitted;
    private int userId;
    private List<Answer> answers;

    public Question(String title, int score, int upVotes, int downVote, Date dateSubmitted, int userId) {
        this.title = title;
        this.score = score;
        this.dateSubmitted = dateSubmitted;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
