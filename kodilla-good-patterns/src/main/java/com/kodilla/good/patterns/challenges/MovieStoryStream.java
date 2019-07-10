package com.kodilla.good.patterns.challenges;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MovieStoryStream {
    public static void main(String[] args) {
        MovieStory movieStory = new MovieStory();
        String films = movieStory.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.joining(", "));
        System.out.println(films);

    }
}
