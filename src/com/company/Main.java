package com.company;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Alan", "Wake");
        Author author1 = new Author("Лев", "Толстой");
        System.out.println("author = " + author.getName() + " " + author.getSurname());
        Book book = new Book("Lake Coldron", 2000, author);
        Book book1 = new Book("Война и мир", 2001, author1);
        System.out.println("book.getPublishingYear() = " + book.getPublishingYear());
        book.setPublishingYear(2025);
        System.out.println("book.getPublishingYear() = " + book.getPublishingYear());
    }
}
