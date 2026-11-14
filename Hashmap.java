import java.util.*;

public class Hashmap{
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();

        //Addition
        map.put("India",30);
        
        map.put("USA",20);
        
        map.put("Russia",10);

        System.out.println(map);

        //Updation
        map.put("Russia",15);

        System.out.println(map);

        if(map.containsKey("Indiaa")){
            
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        //Deletion
        map.remove("USA");
        System.out.println(map);

        //Iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" : " + e.getValue());
        }

        System.out.println("-------------------");

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+":"+map.get(key));
        }
    }
}

// {USA=20, India=30, Russia=10}
// {USA=20, India=30, Russia=15}
// No
// {India=30, Russia=15}
// India : 30
// Russia : 15
// -------------------
// India:30
// Russia:15
