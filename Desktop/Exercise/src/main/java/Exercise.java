import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise {

    public static void main(String[] args) {
        String s = "the cow jumped over the mooned";
        System.out.println(giveMax(s));

        for (Map.Entry<String,Integer> entry:giveMax(s).entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
    // Return the length and longest words in a sentence.
    public static Map<String,Integer> giveMax(String s){
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] array = s.split(" ");
        int max = 0;
        String word="";
        //finds max length word
        for (String str:array){
            if (str.length()>max) {
                max=str.length();
            }
        }
        //adding max length words to the map
        for (String str:array){
            if (str.length()==max){
                map.put(str,max);
            }
        }
        return map;
    }
}