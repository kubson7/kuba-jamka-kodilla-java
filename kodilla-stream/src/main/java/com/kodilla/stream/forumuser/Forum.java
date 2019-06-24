package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    List<ForumUser> ListOfForumUsers = new ArrayList<>();

    public Forum(){
        ListOfForumUsers.add(new ForumUser(9,"AAAAA",Sex.F, LocalDate.of(2002,05,1),3));
        ListOfForumUsers.add(new ForumUser(8,"BBBBB",Sex.M, LocalDate.of(1994,01,4),4));
        ListOfForumUsers.add(new ForumUser(7,"CCCCC",Sex.F, LocalDate.of(2004,02,9),5));
        ListOfForumUsers.add(new ForumUser(6,"DDDDD",Sex.M, LocalDate.of(2001,03,12),1));
        ListOfForumUsers.add(new ForumUser(5,"EEEEE",Sex.F, LocalDate.of(1997,01,14),0));
        ListOfForumUsers.add(new ForumUser(4,"FFFFF",Sex.M, LocalDate.of(1999,06,18),0));
        ListOfForumUsers.add(new ForumUser(3,"GGGGG",Sex.M, LocalDate.of(1998,11,22),5));
        ListOfForumUsers.add(new ForumUser(2,"HHHHH",Sex.F, LocalDate.of(1996,07,27),33));
        ListOfForumUsers.add(new ForumUser(1,"IIIII",Sex.F, LocalDate.of(1995,06,7),32));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(ListOfForumUsers);
    }

}
