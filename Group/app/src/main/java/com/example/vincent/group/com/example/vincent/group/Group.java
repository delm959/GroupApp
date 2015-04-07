package com.example.vincent.group.com.example.vincent.group;

import com.example.vincent.group.com.example.vincent.group.Announcement;
import com.example.vincent.group.com.example.vincent.group.PinnedPost;
import com.example.vincent.group.com.example.vincent.group.User;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Vincent on 7/04/2015.
 */
public class Group {
    /**
     * Each group has a single creator, 0..* admins and 0..* users.
     * Creators/Admins can modify the group in anyway before or during the event.
     * Only the creator can delete the group.
     * */

    private String name;
    private Date startDate, endDate;
    private PinnedPost pinnedPost;
    private ArrayList<Announcement> announcements;
    private User creator;
    private ArrayList<User> admins, members;

    public Group(String name, Date startDate, Date endDate, PinnedPost pinnedPost, User creator) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pinnedPost = pinnedPost;
        this.creator = creator;
    }

    // Getter and setter methods

    public ArrayList<User> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PinnedPost getPinnedPost() {
        return pinnedPost;
    }

    public void setPinnedPost(PinnedPost pinnedPost) {
        this.pinnedPost = pinnedPost;
    }

    public ArrayList<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(ArrayList<Announcement> announcements) {
        this.announcements = announcements;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public ArrayList<User> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<User> admins) {
        this.admins = admins;
    }
}
