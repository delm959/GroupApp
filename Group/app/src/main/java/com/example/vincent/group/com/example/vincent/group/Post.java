package com.example.vincent.group.com.example.vincent.group;

import java.util.ArrayList;

/**
 * Created by Vincent on 7/04/2015.
 */
public class Post {

    /**
     *
     *
     */

    private String title;
    private String content;
    private ArrayList<Comment> comments;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }


    // Getter and setters

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

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
}
