package homework10;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class Book implements Serializable,Comparable {
    private String author;
    private String title;
    private int yearWrite;

    public Book(String author, String title, int yearWrite) {
        this.author = author;
        this.title = title;
        this.yearWrite = yearWrite;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearWrite() {
        return yearWrite;
    }

    public void setYearWrite(int yearWrite) {
        this.yearWrite = yearWrite;
    }

    @Override
    public String toString() {
        return "|" +
                "author= " + author +
                ", title= " + title +
                ", yearWrite= " + yearWrite +
                "|";
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}