package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Sex;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> selectedForumUser = forum.getUserList().stream()
                .filter(sex -> sex.getSex() == Sex.M)
                .filter(date -> date.getBirthday().getYear() <= 1999)
                .filter(posts -> posts.getPublishedPosts()>0)
                .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));

        System.out.println("# elements: " + selectedForumUser.size());
            selectedForumUser.entrySet().stream()
                    .map(entry -> entry.getKey()+ " ==> "+ entry.getValue())
                    .forEach(System.out::println);
    }
}