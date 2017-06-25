package com.gavandjohnsstuff.qa.model;

import java.util.Date;

public class Answer {

    private String name;
    private Date dateSubmitted;
    private String message;
    private int score;

    public Answer(String name, Date dateSubmitted, String message) {
        this.name = name;
        this.dateSubmitted = dateSubmitted;
        this.message = message;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
