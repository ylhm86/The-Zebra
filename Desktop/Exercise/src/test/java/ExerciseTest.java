import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
class ExerciseTest {

    // Test the length and longest words in a sentence. For example, “The cow jumped over the moon.”
    // Test the length and longest words in a sentence with positive scenario.
    @Test
    void giveMax() {
        String s = "the cow jumped over the moon";
        List<String> actualList = Arrays.asList("jumped");
        List<String> words = new ArrayList<String>();
        for (Map.Entry<String,Integer> entry:Exercise.giveMax(s).entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            words.add(entry.getKey());
            Assertions.assertTrue(actualList.contains(entry.getKey()));
        }
        Assertions.assertEquals(actualList.size(),words.size());
    }
    // Test the length and longest words in a sentence with the same length and different words.
    @Test
    void giveSame() {
        String s = "the cow jump over the moon";
        List<String> actualList = Arrays.asList("jump","moon");
        List<String> words = new ArrayList<String>();
        for (Map.Entry<String,Integer> entry:Exercise.giveMax(s).entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            words.add(entry.getKey());
            Assertions.assertTrue(actualList.contains(entry.getKey()));
        }
        Assertions.assertEquals(actualList.size(),words.size());
    }
    // Test the length and longest words in a sentence with the a word.
    @Test
    void giveSingle() {
        String s = "jumped";
        List<String> actualList = Arrays.asList("jumped");
        List<String> words = new ArrayList<String>();
        for (Map.Entry<String,Integer> entry:Exercise.giveMax(s).entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            words.add(entry.getKey());
            Assertions.assertTrue(actualList.contains(entry.getKey()));
        }
        Assertions.assertEquals(actualList.size(),words.size());
    }
    //Test the length and longest words in a sentence with the a empty string.
    @Test
    void giveEmpty() {
        String s = "";
        List<String> actualList = Arrays.asList("");
        List<String> words = new ArrayList<String>();
        for (Map.Entry<String,Integer> entry:Exercise.giveMax(s).entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            words.add(entry.getKey());
            Assertions.assertTrue(actualList.contains(entry.getKey()));
        }
        Assertions.assertEquals(actualList.size(),words.size());
    }
}