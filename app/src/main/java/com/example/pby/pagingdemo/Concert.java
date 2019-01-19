package com.example.pby.pagingdemo;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Concert {
    private String title;
    private String content;
    @SerializedName("authors")
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            return true;
        }
        Concert concert = (Concert) obj;
        return Objects.equals(title, concert.title) && Objects.equals(content, concert.content) && Objects.equals(author, concert.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, author);
    }
}
