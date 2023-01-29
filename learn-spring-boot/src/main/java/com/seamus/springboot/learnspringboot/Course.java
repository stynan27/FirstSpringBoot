package com.seamus.springboot.learnspringboot;

public class Course {
    private long id;
    private String name;
    private String author;

    //Constructor
    public Course(long id, String name, String author) {
      this.id = id;
      this.name = name;
      this.author = author;
    }

    //Getters
    public long getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public String getAuthor() {
      return author;
    }

    //toString
    @Override
    public String toString() {
      // TODO Auto-generated method stub
      return String.format("Course [id: %d, name: %s, author: %s]", this.getId(), this.getName(), this.getAuthor());
    }
}
