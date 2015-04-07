package com.example.vincent.group.com.example.vincent.group;

import java.util.Date;

/**
 * Created by Vincent on 7/04/2015.
 */
public class GuestUser extends User {

    /**
     * Guest users are temporary users that have not yet made a registered
     * account.
     */

    public GuestUser(String name, Date dateCreated, int userID) {
        super(name, dateCreated, userID);
    }
}
