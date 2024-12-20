package com.company;

public class Book {
    private String title;
    private int publishingYear ;
    private Author author;

    public Book(String tittle, int publishingYear, Author author){
        this.title = tittle;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getTittle() {
        return title;
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

    @Override
    public String toString() {
        return author.toString() + ": " + title ;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book otherBook = (Book) other;
        return title.equals(otherBook.title) && author.equals(otherBook.author);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author);
    }
}
