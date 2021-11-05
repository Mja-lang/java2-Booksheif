package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");


        Book b4 = new ChildrensBook("Java for Kids", "Mujahid", "asa");

        Book b1 = new Book("Java Generics", "Mujahid");
        Book b2 = new Book("Java Collections", "Mujahid");
        Book b3 = new Book("Java Collections", "asa");


        List<Book> bookshelf = new ArrayList<>();
        bookshelf.add(b1);
        bookshelf.add(b2);
        bookshelf.add(b3);
        bookshelf.add(0, b4);

        for (int i = 0; i < bookshelf.size(); i++){
            System.out.println(bookshelf.get(i));
        }

    }
}
