package com.example.vincent.group.com.example.vincent.group;

import java.util.Date;

/**
 * Created by Vincent on 7/04/2015.
 */
public class User {

    /**
     * Each person who use this application will have a User object assosciated with
     * them. This contains all the following information.
     */

    private String name;
    private Date dateCreated;
    private int userID;

    public User(String name, Date dateCreated, int userID) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.userID = userID;
    }

    // Getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
