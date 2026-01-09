package com.day8.skillforge;

public class Course {
	private String title;
    private Instructor instructor;
    private double rating; // protected logic
    private String[] modules;
    private String level;
    
    private String[] reviews = { "Good", "Very Helpful" }; // read-only
    
 // Default modules constructor
    public Course(String title, Instructor instructor, String level) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = new String[] { "Intro", "Basics", "Summary" };
        this.rating = 4.5;
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String level, String[] modules) {
        this(title, instructor, level);
        this.modules = modules;
    }

    // Rating logic encapsulated
    public void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = newRating;
        }
    }
    
    public int getTotalModules() {
        return modules.length;
    }

    public String getTitle() {
        return title;
    }

    public String getLevel() {
        return level;
    }

    public double getRating() {
        return rating;
    }

    // Read-only reviews
    public String[] getReviews() {
        return reviews.clone();
    }
}
