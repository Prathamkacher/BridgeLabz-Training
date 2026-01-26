package com.annotationsandreflection.reflections.retrieveannotations;

public class RetrieveAnnotationMain {

    public static void main(String[] args) {

        Class<Book> c = Book.class;

        Author author = c.getAnnotation(Author.class);
        System.out.println("Author: " + author.name());
    }
}