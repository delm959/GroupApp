package com.example.vincent.group.com.example.vincent.group;

import java.util.Date;

/**
 * Created by Vincent on 7/04/2015.
 */
public class Comment {

    /**
     * Comments can be posted on announcements, the group thread, or the pinned post.
     *
     */

    private String content;
    private Date datePosted;

    public Comment(String content, Date datePosted) {
        this.content = content;
        this.datePosted = datePosted;
    }

    // Getter and Setters

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }
}
