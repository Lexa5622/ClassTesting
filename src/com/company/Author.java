package com.company;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname(){
        return  surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author authorTwo = (Author) other;
        return name.equals(authorTwo.name) && surname.equals(authorTwo.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
