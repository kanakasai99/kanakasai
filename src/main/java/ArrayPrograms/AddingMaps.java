package ArrayPrograms;

import java.util.*;

public class AddingMaps {
    public static void main(String[] args) {

       List<Map<String, Integer>> list = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 15);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 15);
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("A", 15);
        list.add(map1);
        list.add(map2);
        list.add(map3);
        System.out.println(list);

//        List<Map.Entry<String,Integer>> list=Arrays.asList(
//                Map.entry("A",15),
//                Map.entry("B",25),
//                Map.entry("A",75),
//                Map.entry("C",35),
//                Map.entry("C",15)
//        );
        Map<String,Integer> map=new HashMap<>();
        for(Map<String,Integer>  maps: list)
        for(Map.Entry<String,Integer> entry: maps.entrySet()){
            String key=entry.getKey();
            int value=entry.getValue();

            if(map.containsKey(key)){
                map.put(key,map.get(key)+value);
            }
            else{
                map.put(key,value);
            }
        }
        System.out.println(map);

    }
}