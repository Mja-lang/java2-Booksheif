package com.company;

public class ChildrensBook extends Book {
    private String illustrator;

    public ChildrensBook(String title, String author, String illustrator) {
        super(title, author);
        this.illustrator = illustrator;
    }

    public String toString() {
        return String.format("%s was written by %s and illustrated by %s",
                getTitle(), getAuthor(), illustrator);
    }
}