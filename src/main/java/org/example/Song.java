package org.example;

public class Song {
    String name;
    String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Song(String name, String autor) {
        this.name = name;
        this.author = autor;
    }

    public Song() {
    }

    @Override
    public String toString() {
        return "Song " +
                "name: " + name +
                ", author: " + author;
    }
}