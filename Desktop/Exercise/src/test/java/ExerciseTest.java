import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.util.*;

class ExerciseTest {

    @Test
    @Tag("RunPositive")
    void giveSingleMaxLengthWordTest() {
        String s = "the cow jumped over the moon";
        List<String> expectedWords = Collections.singletonList("jumped");
        assertWords(s, expectedWords);
    }

    @Test
    @Tag("RunPositive")
    void giveMultipleMaxLengthWordsTest() {
        String s = "the cow jump over the moon";
        List<String> expectedWords = Arrays.asList("jump", "over", "moon");
        assertWords(s, expectedWords);
    }

    @Test
    @Tag("RunPositive")
    void giveSingleWordTest() {
        String s = "jumped";
        List<String> expectedWords = Collections.singletonList("jumped");
        assertWords(s, expectedWords);
    }

    @Test
    @Tag("RunPositive")
    void giveWordsWithNumbersTest() {
        String s = "jumped123";
        List<String> expectedWords = Collections.singletonList("jumped123");
        assertWords(s, expectedWords);
    }
    @Test
    @Tag("RunPositive")
    void giveWordsWithSpacesCharactersTest() {
        String s = "jumped@&%";
        List<String> expectedWords = Collections.singletonList("jumped@&%");
        assertWords(s, expectedWords);
    }

    @Test
    @Tag("RunNegative")
    void giveEmptyStringTest() {
        String s = "";
        List<String> expectedWords = Arrays.asList("");
        assertWords(s, expectedWords);
    }

    @Test
    @Tag("RunNegative")
    void giveEmptySpaceTest() {
        String s = " ";
        List<String> expectedWords = Arrays.asList(" ");
        assertWords(s, expectedWords);
    }

    @Test
    @Tag("RunNegative")
    void giveNullTest() {
        String s = null;
        List<String> expectedWords = null;
        assertWords(s, expectedWords);
    }

    private void assertWords(String s, List<String> expectedList) {
        List<String> actualList = new ArrayList<>();
        Map<String, Integer> actualMap = Exercise.giveMax(s);
        if (actualMap.size() != 0) {
            for (Map.Entry<String, Integer> entry : Exercise.giveMax(s).entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
                actualList.add(entry.getKey());
                Assertions.assertTrue(expectedList.contains(entry.getKey()));
            }
            Assertions.assertEquals(expectedList.size(), actualList.size());
        }
    }
}