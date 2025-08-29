package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String,String> mymap = new HashMap<>();

        // insert
        mymap.put("name","Ananta");
        mymap.put("email","demo@example.com");

        //no traversal is suppoerted


        mymap.put("name","Shinde");

        // delete
        mymap.remove("name");



        // read
        System.out.println(mymap.get("name"));

        //search
        mymap.containsKey("name");
        mymap.containsValue("shinde");




    }
}
