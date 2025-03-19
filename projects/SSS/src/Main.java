import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String s = "abacbcedf";
        // find the first non repeating character

       // char chArr[] = s.toCharArray();

       // s.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Character::charValue

              //  char

        //Arrays.stream();

        //Stream.of(chArr).map()

        //char result = Arrays.stream(s.toCharArray()).mapToObject(char ch -> ( Collectors.groupingBy))

        Map<Character,Integer> map = new LinkedHashMap<>();

        //char resultCh ;

        for(int i = 0 ; i < s.length(); i ++ ) {

            if(map.get(s.charAt(i)) != null ){

                map.put(s.charAt(i),map.get(s.charAt(i)) + 1 );

            }

            else {

                map.put(s.charAt(i),1 );
            }


        }

        System.out.println(map);

         Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        for( Map.Entry<Character,Integer> entry : entrySet ){

            if( entry.getValue() == 1 ) {

               // resultCh = entry.getKey();

                System.out.println(entry.getKey());

               break;
            }

        }





        System.out.println("Hello, World!");
    }
}