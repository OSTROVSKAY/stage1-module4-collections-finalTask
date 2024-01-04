package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> map = new HashMap<>();

        Map<String, Integer> mapInter = new HashMap<>();

        List<Integer> lengthKey1 = new LinkedList<>();

        for(Map.Entry<String, Integer> entry : sourceMap.entrySet()) {

            String key = entry.getKey();

            Integer lengthKey = key.length();

            Integer value = entry.getValue();

            lengthKey1.add(lengthKey);

            mapInter.put(key, lengthKey);

        }


        for(int i = 0; i < lengthKey1.size(); i++) {

            Set<String> set = new HashSet<>();

            for(Map.Entry<String, Integer> entry : mapInter.entrySet() ) {

                String key = entry.getKey();

                Integer lengthKey = entry.getValue();

                if(lengthKey1.get(i) == lengthKey) {

                    set.add(key);

                }

            }

            map.put(lengthKey1.get(i), set);

        }

        return map;

    }
}
