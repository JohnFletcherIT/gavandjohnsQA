package com.teamtreehouse.giflib.model;


import java.util.Date;

public class Question {
    private String title;
    private int rank;
    private int upVotes;
    private int downVote;
    private Date dateSubmitted;
    private int userId;

    public Question(String title, int rank, int upVotes, int downVote, Date dateSubmitted, int userId) {
        this.title = title;
        this.rank = rank;
        this.upVotes = upVotes;
        this.downVote = downVote;
        this.dateSubmitted = dateSubmitted;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
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
