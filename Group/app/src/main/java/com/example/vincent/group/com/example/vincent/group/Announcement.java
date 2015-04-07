package com.example.vincent.group.com.example.vincent.group;

import java.util.Date;

/**
 * Created by Vincent on 7/04/2015.
 */
public class Announcement extends Post {

    /**
     * Each group can have many announcements which explain updates
     * and notifications to the group. When posted the announcement will
     * post a push notification to all the members of the group.
     *
     */

    private Date datePosted;

    public Announcement(String title, String content, Date datePosted) {
        super(title, content);

        this.datePosted = datePosted;
    }
}
