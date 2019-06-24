package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String nameUser;
    private final Sex sex;
    private final LocalDate birthday;
    private final int publishedPosts;

    public ForumUser(int ID, String nameUser, Sex sex, LocalDate birthday, int publishedPosts) {
        this.ID = ID;
        this.nameUser = nameUser;
        this.sex = sex;
        this.birthday = birthday;
        this.publishedPosts = publishedPosts;
    }

    public int getID() {
        return ID;
    }

    public String getNameUser() {
        return nameUser;
    }

    public Sex getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
