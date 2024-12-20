package com.company;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Alan", "Wake");
        Author author1 = new Author("Лев", "Толстой");
        Author author3 = new Author("Alan", "Wake");

        System.out.println(author);
        Book book = new Book("Lake Coldron", 2000, author);
        Book book1 = new Book("Война и мир", 2001, author1);
        Book book3 = new Book(("Lake Coldron"), 2001, author1);
        System.out.println(book);
        book.setPublishingYear(2025);
        System.out.println("book.getPublishingYear() = " + book.getPublishingYear());

        System.out.println(author.equals(author3));
        System.out.println(book1.equals(book3));
    }
}
