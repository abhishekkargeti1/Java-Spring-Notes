package com.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EducationDetails {

    @Column(name = "Year")
    private String year;

    @Column(name = "Board")
    private String board;

    @Column(name = "Percentage")
    private String percentage;

    public EducationDetails() {
        super();
    }

    public EducationDetails(String year, String board, String percentage) {
        this.year = year;
        this.board = board;
        this.percentage = percentage;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "EducationDetails [year=" + year + ", board=" + board + ", percentage=" + percentage + "]";
    }
}
