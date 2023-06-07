package org.lessons.java;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String publisher;

    public Book(String title, int pages, String author, String publisher) {
        if (title != null && title != "") {
            this.title = title;
        } else {
            throw new RuntimeException("Invalid title");
        }
        if (author != null && author != "") {
            this.author = author;
        } else {
            throw new RuntimeException("Invalid author");
        }
        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new RuntimeException("Pages number must be > 0");
        }
        if (publisher != null && publisher != "") {
            this.publisher = publisher;
        } else {
            throw new RuntimeException("Invalid publisher");
        }
    }

    // GETTERS SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && title != "") {
            this.title = title;
        } else {
            throw new RuntimeException("Invalid title");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new RuntimeException("Pages number must be > 0");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && author != "") {
            this.author = author;
        } else {
            throw new RuntimeException("Invalid author");
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher != null && publisher != "") {
            this.publisher = publisher;
        } else {
            throw new RuntimeException("Invalid publisher");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
