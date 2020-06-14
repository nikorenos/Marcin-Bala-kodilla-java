package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

import java.util.ArrayList;

public interface Statistics {
    ArrayList<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}