package com.constructorandaccessmodifiers.level1;

public class Books {

	// Access modifiers
    public String ISBN;        
    protected String title;   
    private String author;     

    // Constructor
    Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for private author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for private author
    public String getAuthor() {
        return author;
    }

}
