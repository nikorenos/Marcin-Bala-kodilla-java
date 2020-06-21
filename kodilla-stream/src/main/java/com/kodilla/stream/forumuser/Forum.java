package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        //public ForumUser(int id, String userName, char sex, LocalDate dateOfBirth, int amountOfPosts) {
        usersList.add(new ForumUser(001, "John",'M', LocalDate.of(1985, 1, 8), 200));
        usersList.add(new ForumUser(002, "Mary",'F', LocalDate.of(2000, 11, 12), 30));
        usersList.add(new ForumUser(003, "Harry",'M', LocalDate.of(1990, 5, 8), 0));
        usersList.add(new ForumUser(004, "Lisa",'F', LocalDate.of(2005, 10, 23), 550));
        usersList.add(new ForumUser(005, "Terry",'M', LocalDate.of(1980, 2, 28), 120));
        usersList.add(new ForumUser(006, "Alan",'M', LocalDate.of(2000, 7, 14), 130));
            }

    public ArrayList<ForumUser> getUsersList() {
        return new ArrayList<ForumUser>(usersList);
    }
}
