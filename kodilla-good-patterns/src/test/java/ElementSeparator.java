import com.kodilla.good.patterns.challenges.MovieStory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElementSeparator {
    @Test
    public void testComponentSeparatorTest(){
        //Given
            List<String> ironManTranslations = new ArrayList<>();
            ironManTranslations.add("Żelazny Człowiek");
            ironManTranslations.add("Iron Man");

            List<String> avengersTranslations = new ArrayList<>();
            avengersTranslations.add("Mściciele");
            avengersTranslations.add("Avengers");

            List<String> flashTranslations = new ArrayList<>();
            flashTranslations.add("Błyskawica");
            flashTranslations.add("Flash");

            Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
            booksTitlesWithTranslations.put("IM", ironManTranslations);
            booksTitlesWithTranslations.put("AV", avengersTranslations);
            booksTitlesWithTranslations.put("FL", flashTranslations);

        MovieStory movieStory = new  MovieStory();
        //When
        String films = movieStory.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.joining("!"));
        //Then
        Assert.assertEquals(films,"Żelazny Człowiek!Iron Man!Mściciele!Avengers!Błyskawica!Flash");
    }
}
