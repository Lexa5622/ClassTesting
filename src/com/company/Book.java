package com.company;

public class Book {
    private String tittle;
    private int publishingYear ;
    private Author author;

    public Book(String tittle, int publishingYear, Author author){
        this.tittle = tittle;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
